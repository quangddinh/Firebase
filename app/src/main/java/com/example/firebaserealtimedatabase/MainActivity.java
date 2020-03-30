package com.example.firebaserealtimedatabase;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;
import java.util.HashMap;

public class MainActivity extends AppCompatActivity {


    // Write a message to the database--------------
    FirebaseDatabase database = FirebaseDatabase.getInstance();
    DatabaseReference myRef = database.getReference();
    // ---------------------------


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // đẩy dl dạng chuỗi lên firebase
        // android : "Khóa học Android 2611"
        // or
        // khaigiang:
        //          android: "Khai giang 2611"

//        myRef.child("android").setValue("Khai giang 2611").addOnCompleteListener(new OnCompleteListener<Void>() {
//            @Override
//            public void onComplete(@NonNull Task<Void> task) {
//                if ( task.isSuccessful()){
//                        Toast.makeText(MainActivity.this,"Thanh cong",Toast.LENGTH_SHORT).show();
//                } else {
//                    Toast.makeText(MainActivity.this,"That bai",Toast.LENGTH_SHORT).show();
//                }
//            }
//        });
//
//        HashMap<String, String>map = new HashMap<>();
//        map.put("xe2banh" , "moto");
//        map.put("xe3banh" , "ba gác");
//        map.put("xe4banh" , "oto");
//
//        myRef.child("Vehicle").setValue(map).addOnCompleteListener(new OnCompleteListener<Void>() {
//            @Override
//            public void onComplete(@NonNull Task<Void> task) {
//                if ( task.isSuccessful()){
//                                Toast.makeText(MainActivity.this,"Thanh cong",Toast.LENGTH_SHORT).show();
//                } else {
//                                Toast.makeText(MainActivity.this,"That bai",Toast.LENGTH_SHORT).show();
//                        }
//            }
//        });

                // gửi dl dạng object
//        myRef.child("sinhvien").setValue(new Sinhvien("Nguyen Van Teo", 20))
//                .addOnCompleteListener(new OnCompleteListener<Void>() {
//            @Override
//            public void onComplete(@NonNull Task<Void> task) {
//                if ( task.isSuccessful()){
//                                Toast.makeText(MainActivity.this,"Thanh cong",Toast.LENGTH_SHORT).show();
//                } else {
//                                Toast.makeText(MainActivity.this,"That bai",Toast.LENGTH_SHORT).show();
//                        }
//            }
//        });
//
        // khai báo mảng Sinhvien
        ArrayList<Sinhvien> sinhviens = new ArrayList<>();
        sinhviens.add(new Sinhvien("Nguyen Van F", 10));
        sinhviens.add(new Sinhvien("Nguyen Van G", 13));
        sinhviens.add(new Sinhvien("Nguyen Van H", 42));
        sinhviens.add(new Sinhvien("Nguyen Van I", 11));
        sinhviens.add(new Sinhvien("Nguyen Van J", 16));

//        myRef.child("danhsach").push().setValue(sinhviens).addOnCompleteListener(new OnCompleteListener<Void>() {
//            @Override
//            public void onComplete(@NonNull Task<Void> task) {
//                if ( task.isSuccessful()){
//                            Toast.makeText(MainActivity.this,"Thanh cong",Toast.LENGTH_SHORT).show();
//                } else {
//                            Toast.makeText(MainActivity.this,"That bai",Toast.LENGTH_SHORT).show();
//                    }
//            }
//        });

        myRef.child("danhsach").push().setValue(new Sinhvien("Nguyen Van K",29))
                .addOnCompleteListener(new OnCompleteListener<Void>() {
                    @Override
                    public void onComplete(@NonNull Task<Void> task) {
                        if ( task.isSuccessful()){
                            Toast.makeText(MainActivity.this,"Thanh cong",Toast.LENGTH_SHORT).show();
                        } else {
                            Toast.makeText(MainActivity.this,"That bai",Toast.LENGTH_SHORT).show();
                        }
                    }
                });


    }
}
