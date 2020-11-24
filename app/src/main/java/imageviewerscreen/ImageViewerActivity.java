package imageviewerscreen;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.os.Environment;
import android.provider.MediaStore;
import android.text.format.Time;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.myprog.redditnews.R;
import com.squareup.picasso.Picasso;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class ImageViewerActivity extends AppCompatActivity {
    public static final String EXTRA_URL = "url_pictures";
    ImageView mImageView;
    Button mButton;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_viewer);
        mImageView = findViewById(R.id.url_image);
        mButton = findViewById(R.id.save);
        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                save(mImageView);
            }
        });
        String url = (String) getIntent().getExtras().get(EXTRA_URL);
        Picasso.with(this)
                .load(url)
                .placeholder(R.drawable.placeholder)
                .into(mImageView);
    }

    public void save(ImageView imageView) {
        OutputStream outputStream = null;
        Time time = new Time();
        time.setToNow();
        String folderToSave = Environment.DIRECTORY_PICTURES;
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(time.year)
                .append("-")
                .append(time.month + 1)
                .append("-")
                .append(time.monthDay)
                .append("-")
                .append(time.hour)
                .append("-")
                .append(time.minute)
                .append("-")
                .append(time.second)
                .append(".jpg");

        String fileName = stringBuffer.toString();

        try {
            File file = new File(folderToSave, fileName);
            outputStream = new FileOutputStream(file);
            Bitmap bitmap = ((BitmapDrawable) imageView.getDrawable()).getBitmap();
            bitmap.compress(Bitmap.CompressFormat.JPEG, 100, outputStream);
            outputStream.flush();
            outputStream.close();
            MediaStore.Images.Media.insertImage(getContentResolver(), file.getAbsolutePath(), fileName, fileName);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}