package brain.richprob;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import jp.wasabeef.richeditor.RichEditor;


public class MainActivity extends AppCompatActivity {
    private RichEditor mEditor;
    //private Button button;
    //private Button button2;
    //private Button button3;
    private TextView tVCheckBox;
    private TextView tVBold;
    private LinearLayout LLCheckBox;
    private LinearLayout LLBold;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mEditor = (RichEditor)findViewById(R.id.editor);
        LLCheckBox = (LinearLayout)findViewById(R.id.LLCheckBox);
        LLBold = (LinearLayout)findViewById(R.id.LLBold);
        LLCheckBox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mEditor.insertTodo();
            }
        });
        LLBold.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mEditor.setBold();
            }
        });
        mEditor.setPlaceholder("Insert text here...");
    }
}
