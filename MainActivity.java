package com.example.checkoutputadam;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView title,status,about,description,symptoms_para1,symptoms_para2,cause_para1,cause_para2,treatment_para1,treatment_para2,prevention_para1,medication_para1,medication_para2,surgery_para1,surgery_para2,surgery_para3,surgery_para4,homeremedies_para1,alternative_desc,coping_para1;
    ImageView disease_img, disease_graph;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int x = 11;

        title = findViewById(R.id.about_disease_title);
        status = findViewById(R.id.about_disease_status);
        about = findViewById(R.id.about_disease_about);
        description =  findViewById(R.id.about_disease_desc);
        symptoms_para1 = findViewById(R.id.SYMPTOMS_symptoms_para1);
        symptoms_para2 = findViewById(R.id.SYMPTOMS_symptoms_para2);
        cause_para1 = findViewById(R.id.SYMPTOMS__cause_para1);
        cause_para2 = findViewById(R.id.SYMPTOMS_cause_para2);
        treatment_para1 = findViewById(R.id.TREATMENT_treatment_para1);
        treatment_para2 = findViewById(R.id.TREATMENT_treatment_para2);
        prevention_para1 = findViewById(R.id.TREATMENT_prevention_para1);
        medication_para1 = findViewById(R.id.TREATMENT_Medication_para1);
        medication_para2 = findViewById(R.id.TREATMENT_Medication_para2);
        surgery_para1 = findViewById(R.id.TREATMENT_Surgery_para1);
        surgery_para2 = findViewById(R.id.TREATMENT_Surgery_para2);
        surgery_para3 = findViewById(R.id.TREATMENT_Surgery_para3);
        surgery_para4 = findViewById(R.id.TREATMENT_Surgery_para4);
        homeremedies_para1 = findViewById(R.id.TREATMENT_HomeRemEdies_para1);
        alternative_desc = findViewById(R.id.TREATMENT_Alternatve_desc);
        coping_para1 = findViewById(R.id.TREATMENT_Coping_and_Support_para1);

        disease_img = findViewById(R.id.about_disease_image);
        disease_graph = findViewById(R.id.about_disease_graph);


        switch (x)
        {
            //hair
            case 11:
                //ABOUT
                title.setText();
                status.setText();
                about.setText();
                description.setText();

                //SYMPTOMS
                symptoms_para1.setText();
                symptoms_para2.setText();

                //CAUSE
                cause_para1.setText();
                cause_para2.setText();

                //TREATMENT
                treatment_para1.setText();
                treatment_para2.setText();

                //PREVENTION
                prevention_para1.setText();

                //MEDICATION
                medication_para1.setText();
                medication_para2.setText();

                //SURGERY
                surgery_para1.setText();
                surgery_para2.setText();
                surgery_para3.setText();
                surgery_para4.setText();

                //HOME REMEDIES
                homeremedies_para1.setText();

                //ALTERNATIVE TREATMENT
                alternative_desc.setText();

                //COPING
                coping_para1.setText();
                break;
            case 12: break;
            case 13: break;

            //forehead
            case 21: break;
            case 22: break;
            case 23: break;
            case 24: break;

            //eyes
            case 31: break;
            case 32:break;
            case 33: break;
            case 34: break;

            //nose
            case 41: break;
            case 42: break;
            case 43: break;
            case 44: break;
            case 45: break;

            //mouth
            case 51: break;
            case 52: break;
            case 53: break;
            case 54: break;
            case 55: break;

            //faceskin
            case 61: break;
            case 62: break;
            case 63: break;

            //ear
            case 71: break;
            case 72: break;
            case 73: break;
            case 74: break;
            case 75: break;

            //backhead
            case 81: break;
            case 82: break;
            case 83: break;
            case 84: break;
            case 85: break;

            //backneck
            case 91: break;
            case 92: break;
            case 93: break;

            //frontneck
            case 101: break;
            case 102: break;
            case 103: break;
            case 104: break;
            case 105: break;

            //shoulder
            case 111: break;
            case 112: break;
            case 113: break;
            case 114: break;
            case 115: break;
            //chest
            case 121: break;
            case 122: break;
            case 123: break;
            case 124: break;
            case 125: break;

            //heart
            case 131: break;
            case 132: break;
            case 133: break;
            case 134: break;
            case 135: break;

            //liver
            case 141: break;
            case 142: break;
            case 143: break;
            case 144: break;
            case 145: break;

            //stomach
            case 151: break;
            case 152: break;
            case 153: break;
            case 154: break;
            case 155: break;

            //arms
            case 161: break;
            case 162: break;
            case 163: break;
            case 164: break;
            case 165: break;
            //elbow
            case 171: break;
            case 172: break;
            case 173: break;

            //thigh
            case 181: break;
            case 182: break;
            case 183: break;

            //knee
            case 191: break;
            case 192: break;
            case 193: break;
            //leg
            case 201: break;
            case 202: break;
            case 203: break;

            //pelvic
            case 211: break;
            case 212: break;
            case 213: break;
            case 214: break;

            //buttock
            case 221: break;
            case 222: break;
            case 223: break;

            //upperback
            case 231: break;
            case 232: break;
            case 233: break;

            //lowerback
            case 241: break;
            case 242: break;
            case 243: break;

            //kidney
            case 251: break;
            case 252: break;
            case 253: break;
            case 254: break;
            case 255: break;






        }
    }
}
