package pointnote.scripturereference;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class GetInput extends AppCompatActivity {
    public final static String EXTRA_MESSAGE = "Your favorite scripture is: ";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_get_input);
    }

    public void sendMessage(View view) {
        Intent intent = new Intent(this, DisplayText.class);
        EditText editText = (EditText) findViewById(R.id.book);
        String message = "Your favorite scripture is: ";
        message += editText.getText().toString();
        message += " ";
        EditText editChapter = (EditText) findViewById(R.id.chapter);
        message += editChapter.getText().toString();
        message += ":";
        EditText editVerse = (EditText) findViewById(R.id.verse);
        message += editVerse.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }
}
