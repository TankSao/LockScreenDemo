package com.example.administrator.lockscreendemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.Display;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private TextView lock;
    private boolean locked = false;
    private Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn0, btn_del, btn_conf;
    private PopupWindow popupWindow;
    private EditText editText;
    private Editable editable;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        View keyboardView = LayoutInflater.from(this).inflate(R.layout.pop_password_input, null);
        Display display = getWindowManager().getDefaultDisplay();
        int height = (int) getResources().getDimension(R.dimen.dp_lock_height);
        int width = (int) getResources().getDimension(R.dimen.dp_lock_width);
        popupWindow = new PopupWindow(keyboardView, width, height * 4, false);
        initViewPop(keyboardView);
        lock = (TextView) findViewById(R.id.lock);
        lock.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (locked) {
                    //解锁
                    updateKeyBoard();
                    popupWindow.showAtLocation(getWindow().getDecorView(), Gravity.CENTER, 0, 0);
                    popupWindow.update();
                    btn_conf.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            // TODO Auto-generated method stub
                            if (editText.getText().toString().equals("654321")) {
                                popupWindow.dismiss();
                                locked = false;
                                editable.clear();
                                lock.setText("加锁");
                                Toast.makeText(MainActivity.this, "解锁成功", Toast.LENGTH_SHORT).show();
                            } else {
                                popupWindow.dismiss();
                                editable.clear();
                                Toast.makeText(MainActivity.this, "密码错误", Toast.LENGTH_SHORT).show();
                            }
                        }
                    });

                } else {
                    //锁屏
                    locked = true;
                    lock.setText("解锁");
                    Toast.makeText(MainActivity.this, "锁屏成功", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
    private void initViewPop(View keyboardView) {
        btn0 = (Button) keyboardView.findViewById(R.id.keyboard_btn0);
        btn1 = (Button) keyboardView.findViewById(R.id.keyboard_btn1);
        btn2 = (Button) keyboardView.findViewById(R.id.keyboard_btn2);
        btn3 = (Button) keyboardView.findViewById(R.id.keyboard_btn3);
        btn4 = (Button) keyboardView.findViewById(R.id.keyboard_btn4);
        btn5 = (Button) keyboardView.findViewById(R.id.keyboard_btn5);
        btn6 = (Button) keyboardView.findViewById(R.id.keyboard_btn6);
        btn7 = (Button) keyboardView.findViewById(R.id.keyboard_btn7);
        btn8 = (Button) keyboardView.findViewById(R.id.keyboard_btn8);
        btn9 = (Button) keyboardView.findViewById(R.id.keyboard_btn9);
        btn_del = (Button) keyboardView.findViewById(R.id.keyboard_btn_del);
        btn_conf = (Button) keyboardView.findViewById(R.id.keyboard_btn_conf);
        editText = (EditText) keyboardView.findViewById(R.id.password);
        editable = editText.getEditableText();
        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                int index = editText.getSelectionStart();
                String str = btn0.getText().toString();
                editable.insert(index, str);
            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                int index = editText.getSelectionStart();
                String str = btn1.getText().toString();
                editable.insert(index, str);
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                int index = editText.getSelectionStart();
                String str = btn2.getText().toString();
                editable.insert(index, str);
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                int index = editText.getSelectionStart();
                String str = btn3.getText().toString();
                editable.insert(index, str);
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                int index = editText.getSelectionStart();
                String str = btn4.getText().toString();
                editable.insert(index, str);
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                int index = editText.getSelectionStart();
                String str = btn5.getText().toString();
                editable.insert(index, str);
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                int index = editText.getSelectionStart();
                String str = btn6.getText().toString();
                editable.insert(index, str);
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                int index = editText.getSelectionStart();
                String str = btn7.getText().toString();
                editable.insert(index, str);
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                int index = editText.getSelectionStart();
                String str = btn8.getText().toString();
                editable.insert(index, str);
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                int index = editText.getSelectionStart();
                String str = btn9.getText().toString();
                editable.insert(index, str);
            }
        });

        btn_del.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                try {
                    int index = editText.getSelectionStart();
                    editable.delete(index - 1, index);
                } catch (Exception e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        });

    }
    private void updateKeyBoard() {
        int[] randomNum = getRandomNum();
        btn0.setText(randomNum[0] + "");
        btn1.setText(randomNum[1] + "");
        btn2.setText(randomNum[2] + "");
        btn3.setText(randomNum[3] + "");
        btn4.setText(randomNum[4] + "");
        btn5.setText(randomNum[5] + "");
        btn6.setText(randomNum[6] + "");
        btn7.setText(randomNum[7] + "");
        btn8.setText(randomNum[8] + "");
        btn9.setText(randomNum[9] + "");
    }
    private int[] getRandomNum() {
        Random random = new Random();
        int[] data = new int[10];
        boolean b;
        boolean b2 = false;
        boolean b3 = true;
        int x;
        for (int i = 0; i < 10; i++) {
            b = true;
            while (b) {
                x = random.nextInt(10);
                if (x == 0 && b3) {
                    b3 = false;
                    b = false;
                }
                for (int y : data) {
                    if (x == y) {
                        b2 = false;
                        break;
                    } else {
                        b2 = true;
                    }
                }
                if (b2) {
                    data[i] = x;
                    b = false;
                    break;
                }
            }

        }
        return data;
    }
    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == event.KEYCODE_BACK) {
            if (locked) {
                return true;
            } else {
                onBackPressed();
                return true;
            }
        }
        if (keyCode == event.KEYCODE_HOME || keyCode == event.KEYCODE_MENU) {
            if (locked) {
                return true;
            }
        }
        return super.onKeyDown(keyCode, event);
    }
}
