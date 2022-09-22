package br.pucpr.bradesco.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import net.objecthunter.exp4j.Expression;
import net.objecthunter.exp4j.ExpressionBuilder;


public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private Button btn_one, btn_two, btn_three, btn_four, btn_five, btn_six, btn_seven, btn_eight, btn_nine, btn_zero,
            btn_AC, btn_negative, btn_division, btn_multiply, btn_minus, btn_plus, btn_equal, btn_dot;

    private TextView txt_expression, txt_result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Start_Components();

        btn_zero.setOnClickListener(this);
        btn_one.setOnClickListener(this);
        btn_two.setOnClickListener(this);
        btn_three.setOnClickListener(this);
        btn_four.setOnClickListener(this);
        btn_five.setOnClickListener(this);
        btn_six.setOnClickListener(this);
        btn_seven.setOnClickListener(this);
        btn_eight.setOnClickListener(this);
        btn_nine.setOnClickListener(this);
        btn_dot.setOnClickListener(this);
        btn_negative.setOnClickListener(this);
        btn_division.setOnClickListener(this);
        btn_multiply.setOnClickListener(this);
        btn_minus.setOnClickListener(this);
        btn_plus.setOnClickListener(this);


        btn_AC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                txt_expression.setText("");
                txt_result.setText("");
            }
        });

        btn_equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                try {
                    Expression expression = new ExpressionBuilder(txt_expression.getText().toString()).build();
                    double result = expression.evaluate();
                    long longResult = (long) result;

                    if (result == (double) longResult) {
                        txt_result.setText((CharSequence) String.valueOf(longResult));
                    }else{
                        txt_result.setText((CharSequence) String.valueOf(result));
                    }
                }catch (Exception e) {

                }


            }
        });

    }

    private void Start_Components() {
        btn_zero = findViewById(R.id.btn_zero);
        btn_one = findViewById(R.id.btn_one);
        btn_two = findViewById(R.id.btn_two);
        btn_three = findViewById(R.id.btn_three);
        btn_four = findViewById(R.id.btn_four);
        btn_five = findViewById(R.id.btn_five);
        btn_six = findViewById(R.id.btn_six);
        btn_seven = findViewById(R.id.btn_seven);
        btn_eight = findViewById(R.id.btn_eight);
        btn_nine = findViewById(R.id.btn_nine);
        btn_dot = findViewById(R.id.btn_dot);
        btn_AC = findViewById(R.id.btn_AC);
        btn_negative = findViewById(R.id.btn_negative);
        btn_division = findViewById(R.id.btn_division);
        btn_multiply = findViewById(R.id.btn_multiply);
        btn_minus = findViewById(R.id.btn_minus);
        btn_plus = findViewById(R.id.btn_plus);
        btn_equal = findViewById(R.id.btn_equal);

        txt_expression = findViewById(R.id.txt_expression);
        txt_result = findViewById(R.id.txt_result);

    }

    public void Add_Expression(String string, boolean clean_data) {

        if (txt_result.getText().equals("")) {
            txt_expression.setText(" ");
        }

        if(clean_data) {
            txt_result.setText(" ");
            txt_expression.append(string);
        }else{
            txt_expression.append(txt_result.getText());
            txt_expression.append(string);
            txt_result.setText(" ");
        }
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_zero:
                Add_Expression("0", true);
                break;

            case R.id.btn_one:
                Add_Expression("1", true);
                break;

            case R.id.btn_two:
                Add_Expression("2", true);
                break;

            case R.id.btn_three:
                Add_Expression("3", true);
                break;

            case R.id.btn_four:
                Add_Expression("4", true);
                break;

            case R.id.btn_five:
                Add_Expression("5", true);
                break;

            case R.id.btn_six:
                Add_Expression("6", true);
                break;

            case R.id.btn_seven:
                Add_Expression("7", true);
                break;

            case R.id.btn_eight:
                Add_Expression("8", true);
                break;

            case R.id.btn_nine:
                Add_Expression("9", true);
                break;

            case R.id.btn_dot:
                Add_Expression(".", true);
                break;

            case R.id.btn_AC:
                Add_Expression("", true);
                break;

            case R.id.btn_negative:
                Add_Expression("- ", false);
                break;


            case R.id.btn_division:
                Add_Expression("/ ", false);
                break;

            case R.id.btn_multiply:
                Add_Expression("* ", false);
                break;

            case R.id.btn_minus:
                Add_Expression("- ", false);
                break;

            case R.id.btn_plus:
                Add_Expression("+ ", false);
                break;

            case R.id.btn_equal:
                Add_Expression("= ", false);
                break;
        }
    }
}