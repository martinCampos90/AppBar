package bulebar.reservacion.appbar;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TimePicker;
import android.widget.Toast;

import com.cepheuen.elegantnumberbutton.view.ElegantNumberButton;
import com.rengwuxian.materialedittext.MaterialEditText;
import com.rey.material.widget.Button;
import com.wdullaer.materialdatetimepicker.date.DatePickerDialog;
import com.wdullaer.materialdatetimepicker.time.TimePickerDialog;

import java.sql.Time;
import java.util.Calendar;
import java.util.Date;

public class reservacionForm extends AppCompatActivity implements DatePickerDialog.OnDateSetListener,TimePickerDialog.OnTimeSetListener{

    MaterialEditText edtNombre,edtDatePicker,edtTimePicker;
    ElegantNumberButton numberCoche,numberPersona;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reservacion_form);

        edtNombre = (MaterialEditText)findViewById(R.id.edtNombre);
        numberCoche = (ElegantNumberButton)findViewById(R.id.numberCoche);
        numberPersona = (ElegantNumberButton)findViewById(R.id.numberPersona);


        edtDatePicker = (MaterialEditText)findViewById(R.id.edtDatePicker);
        edtTimePicker = (MaterialEditText)findViewById(R.id.edtTimePicker);

        edtDatePicker.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Calendar now = Calendar.getInstance();
                DatePickerDialog datePickerDialog = DatePickerDialog.newInstance(reservacionForm.this
                ,now.get(Calendar.YEAR)
                ,now.get(Calendar.MONTH)
                ,now.get(Calendar.DAY_OF_MONTH));

                datePickerDialog.setTitle("DatePicker Dialog");
                datePickerDialog.show(getFragmentManager(),"DatePicker");
            }
        });

        edtTimePicker.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Calendar now = Calendar.getInstance();
                TimePickerDialog timePickerDialog = TimePickerDialog.newInstance(reservacionForm.this
                ,now.get(Calendar.HOUR_OF_DAY)
                ,now.get(Calendar.MINUTE)
                ,true);//true = is 24 hours, false is 12 hours

                timePickerDialog.setTitle("TimePicker Dialog");
                timePickerDialog.show(getFragmentManager(),"TimePicker");

            }
        });


    }


    @Override
    public void onDateSet(DatePickerDialog view, int year, int monthOfYear, int dayOfMonth) {
        //Toast.makeText(this,String.format("You selected : %d/%d,%d",monthOfYear,dayOfMonth,year),Toast.LENGTH_SHORT).show();
        edtDatePicker.setText(String.format("%d/%d/%d",dayOfMonth,monthOfYear,year));
    }

    @Override
    public void onTimeSet(TimePickerDialog view, int hourOfDay, int minute, int second) {
        //Toast.makeText(this,String.format("You selected : %02d:%02d:%02d",hourOfDay,minute,second),Toast.LENGTH_SHORT).show();
        edtTimePicker.setText(String.format("%02d:%02d:%02d",hourOfDay,minute,second));
    }
}
