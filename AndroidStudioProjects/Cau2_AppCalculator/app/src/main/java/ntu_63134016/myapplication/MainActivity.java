package ntu_63134016.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.button.MaterialButton;
import  org.mozilla.javascript.Context;
import  org.mozilla.javascript.Scriptable;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView resultTV, solutionTV;
    MaterialButton buttonC, buttonBrackOpen, buttonBrackClose;
    MaterialButton buttonDivide, buttonMultiply, buttonPlus, buttonMinus, buttonEquals;
    MaterialButton button0, button1, button2, button3, button4, button5, button6, button7, button8, button9;
    MaterialButton buttonAC,buttonDot;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        resultTV = findViewById(R.id.result_tv);
        solutionTV = findViewById(R.id.solution_tv);

        assignIn(buttonC,R.id.buton_c);
        assignIn(buttonBrackOpen,R.id.buton_open_bracket);
        assignIn(buttonBrackClose,R.id.buton_close_bracket);
        assignIn(buttonDivide,R.id.buton_divide);
        assignIn(buttonMultiply,R.id.buton_multiply);
        assignIn(buttonPlus,R.id.buton_plus);
        assignIn(buttonMinus,R.id.buton_minus);
        assignIn(buttonEquals,R.id.buton_equal);
        assignIn(button0,R.id.buton_0);
        assignIn(button1,R.id.buton_1);
        assignIn(button2,R.id.buton_2);
        assignIn(button3,R.id.buton_3);
        assignIn(button4,R.id.buton_4);
        assignIn(button5,R.id.buton_5);
        assignIn(button6,R.id.buton_6);
        assignIn(button7,R.id.buton_7);
        assignIn(button8,R.id.buton_8);
        assignIn(button9,R.id.buton_9);
        assignIn(buttonAC,R.id.buton_ac);
        assignIn(buttonDot,R.id.buton_dot);
    }

    void assignIn(MaterialButton btn, int id){
        btn = findViewById(id);
        btn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        MaterialButton button =(MaterialButton) v;
        String buttonText = button.getText().toString();
        String dataToCalculate = solutionTV.getText().toString();

        if(buttonText.equals("AC")){
            solutionTV.setText("");
            resultTV.setText("0");
            return;
        }
        if(buttonText.equals("=")){
            String finalResult =getResult(dataToCalculate);
            if(!finalResult.equals("Error")){
                resultTV.setText(finalResult);
            }
            solutionTV.setText(resultTV.getText());
            return;
        }
        if(buttonText.equals("C")){
            if(!dataToCalculate.equals("")) {
                if(dataToCalculate.length()==1){
                    solutionTV.setText("");
                    resultTV.setText("0");
                    return;
                }else {
                    dataToCalculate = dataToCalculate.substring(0, dataToCalculate.length() - 1);
                }
            }else{
                return;
            }
        }else {
            dataToCalculate =dataToCalculate+buttonText;
        }
        solutionTV.setText(dataToCalculate);

    }
    String getResult(String data){
        try {
            Context context =Context.enter();
            context.setOptimizationLevel(-1);
            Scriptable scriptable = context.initStandardObjects();
            String finalResult = context.evaluateString(scriptable,data,"Javascript",1,null).toString();
            if(finalResult.endsWith(".0")){
                finalResult =finalResult.replace(".0","");
            }
            return finalResult;
        }catch (Exception e){
            return "Error";
        }

    }
}