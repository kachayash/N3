package com.plants.n3;

import static android.app.NotificationManager.*;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;

import android.app.AlarmManager;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.Toast;

import com.plants.n3.databinding.ActivityMainBinding;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Calendar;
import java.util.TimeZone;

public class it extends AppCompatActivity {


    Spinner s1, s2, s3;
    ImageView imageView;

    private Button btn;
    public static String CID = "1001";
    public static String defult_notification_id = "defult";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_it);
        //Spinner
        s1 = findViewById(R.id.spinner1);
        s2 = findViewById(R.id.spinner2);
        s3 = findViewById(R.id.spinner3);
        imageView = findViewById(R.id.tt_img);
        btn = findViewById(R.id.button);
        FAMON();
        FATTUE();
        FAFRI();
        FASUT();
        FATHU();
        FAWEN();

        final String[] sem = {"Select", "Semester 1", "Semester 2", "Semester 3", "Semester 4", "Semester 5", "Semester 6"};
        final String[] sem1 = {"Select", "Class A1", "Class B1", "Class C1"};
        final String[] sem2 = {"Select", "Select", "Class A2", "Class B2"};
        final String[] sem3 = {"Select", "Class A3", "Class B3"};
        final String[] sem4 = {"Select", "Class A4", "Class B4"};
        final String[] sem5 = {"Select", "Class A5", "Class B5"};
        final String[] sem6 = {"Select", "Class A6", "Class B6"};
        final String[] days = {"Select", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};


        ArrayAdapter<String> a1 = new ArrayAdapter<>(this, R.layout.dropdown, sem);
        ArrayAdapter<String> a2 = new ArrayAdapter<>(this, R.layout.dropdown, sem1);
        ArrayAdapter<String> a3 = new ArrayAdapter<>(this, R.layout.dropdown, sem2);
        ArrayAdapter<String> a4 = new ArrayAdapter<>(this, R.layout.dropdown, sem3);
        ArrayAdapter<String> a5 = new ArrayAdapter<>(this, R.layout.dropdown, sem4);
        ArrayAdapter<String> a6 = new ArrayAdapter<>(this, R.layout.dropdown, sem5);
        ArrayAdapter<String> a7 = new ArrayAdapter<>(this, R.layout.dropdown, sem6);
        ArrayAdapter<String> d1 = new ArrayAdapter<>(this, R.layout.dropdown, days);

        s1.setAdapter(a1);

        s1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                //sem 1
                if (position == 1) {
                    s2.setAdapter(a2);

                    s3.setAdapter(d1);

                    s3.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                        @Override
                        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                            if (position == 1) {
                                imageView.setImageResource(R.drawable.no_data);
                            } else if (position == 2) {
                                imageView.setImageResource(R.drawable.no_data);
                            } else if (position == 3) {
                                imageView.setImageResource(R.drawable.no_data);
                            } else if (position == 4) {
                                imageView.setImageResource(R.drawable.no_data);
                            } else if (position == 5) {
                                imageView.setImageResource(R.drawable.no_data);
                            } else if (position == 6) {
                                imageView.setImageResource(R.drawable.no_data);
                            }


                        }

                        @Override
                        public void onNothingSelected(AdapterView<?> parent) {

                        }
                    });
                }
                //sem2
                else if (position == 2) {
                    s2.setAdapter(a3);
                    //set image
//                    s2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
//                        @Override
//                        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
//                            if (position == 1){
//                                imageView.setImageResource(R.drawable.no_data);
//                            } else if (position == 2) {
//                                imageView.setImageResource(R.drawable.no_data);
//                            }
//
//                        }
//
//                        @Override
//                        public void onNothingSelected(AdapterView<?> parent) {
//
//                        }
//                    });
                }
                //sem3
                else if (position == 3) {
                    s2.setAdapter(a4);
                    //set image
//                    s2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
//                        @Override
//                        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
//                            if (position == 1){
//                                imageView.setImageResource(R.drawable.no_data);
//                            } else if (position == 2) {
//                                imageView.setImageResource(R.drawable.no_data);
//                            }
//
//                        }
//
//                        @Override
//                        public void onNothingSelected(AdapterView<?> parent) {
//
//                        }
//                    });
                }
                //sem4
                else if (position == 4) {
                    s2.setAdapter(a5);
                    //set image
//                    s2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
//                        @Override
//                        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
//                            if (position == 1){
//                                imageView.setImageResource(R.drawable.no_data);
//                            } else if (position == 2) {
//                                imageView.setImageResource(R.drawable.no_data);
//                            }
//
//                        }
//
//                        @Override
//                        public void onNothingSelected(AdapterView<?> parent) {
//
//                        }
//                    });
                }
                //sem5
                else if (position == 5) {
                    s2.setAdapter(a6);

                    //set image
//                    s2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
//                        @Override
//                        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
//                            if (position == 1){
//                                imageView.setImageResource(R.drawable.no_data);
//                            } else if (position == 2) {
//                                imageView.setImageResource(R.drawable.no_data);
//                            }
//
//                        }
//
//                        @Override
//                        public void onNothingSelected(AdapterView<?> parent) {
//
//                        }
//                    });
                }
                //sem6
                else {

                    s2.setAdapter(a7);
                    s2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                        @Override
                        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                            //A6 DONE
                            if (position == 1) {
                                s3.setAdapter(d1);
                                s3.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                    @Override
                                    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                                        //monday
                                        if (position == 1) {
                                            imageView.setImageResource(R.drawable.sem_6a_monday);
                                            btn.setOnClickListener(new View.OnClickListener() {
                                                @Override
                                                public void onClick(View v) {
                                                    Intent intent = new Intent(it.this, Reciver.class);
                                                    PendingIntent pendingIntent =   PendingIntent.getBroadcast(it.this,0,intent, PendingIntent.FLAG_IMMUTABLE);
                                                    AlarmManager alarmManager = (AlarmManager) getSystemService(ALARM_SERVICE);
//                                                    long at = System.currentTimeMillis();
//                                                    long bt = 1000*2;



                                                    Calendar istCalendar = Calendar.getInstance(TimeZone.getTimeZone("Asia/Kolkata"));
                                                    istCalendar.add(Calendar.DAY_OF_YEAR,1);
                                                    istCalendar.set(Calendar.HOUR_OF_DAY, 10); // 12 PM
                                                    istCalendar.set(Calendar.MINUTE, 15);       // 40 minutes
                                                    istCalendar.set(Calendar.SECOND, 0);        // 0 seconds
                                                    istCalendar.set(Calendar.MILLISECOND, 0);
                                                    long time = istCalendar.getTimeInMillis();

                                                    alarmManager.set(AlarmManager.RTC_WAKEUP,time,pendingIntent);
                                                    Toast.makeText(it.this , "Time Set Succesfully",Toast.LENGTH_SHORT).show();


                                                }
                                            });

//                                            Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("Asia/Kolkata"));
//
//                                            calendar.set(Calendar.DAY_OF_WEEK, Calendar.SUNDAY);
//
//                                            if (calendar.get(Calendar.DAY_OF_WEEK) != Calendar.SUNDAY) {
//                                                calendar.add(Calendar.WEEK_OF_YEAR, 1);
//                                            }
//
//                                            calendar.set(Calendar.HOUR_OF_DAY, 10);
//                                            calendar.set(Calendar.MINUTE, 0);
//                                            calendar.set(Calendar.SECOND, 0);

// Get the AlarmManager service



//                long ct = 3000;

                                        }
                                        else if (position == 2) {
                                            imageView.setImageResource(R.drawable.sem_6a_tuesday);
                                            btn.setOnClickListener(new View.OnClickListener() {
                                                @Override
                                                public void onClick(View v) {
                                                    Toast.makeText(it.this , "Set time tuesday",Toast.LENGTH_SHORT).show();
                                                    Intent intent = new Intent(it.this, Fthtuereciver.class);
                                                    PendingIntent pendingIntent =   PendingIntent.getBroadcast(it.this,0,intent, PendingIntent.FLAG_IMMUTABLE);
                                                    AlarmManager alarmManager = (AlarmManager) getSystemService(ALARM_SERVICE);
                                                    long at = System.currentTimeMillis();
                                                    long bt = 1000*2;



                                                    Calendar istCalendar = Calendar.getInstance(TimeZone.getTimeZone("Asia/Kolkata"));
                                                    istCalendar.set(Calendar.HOUR_OF_DAY, 19); // 12 PM
                                                    istCalendar.set(Calendar.MINUTE, 24);       // 40 minutes
                                                    istCalendar.set(Calendar.SECOND, 0);        // 0 seconds
                                                    istCalendar.set(Calendar.MILLISECOND, 0);
                                                    long time = istCalendar.getTimeInMillis();

                                                    alarmManager.set(AlarmManager.RTC_WAKEUP,at+bt,pendingIntent);
                                                    btn.setEnabled(true);
                                                }
                                            });
                                        }
                                        else if (position == 3) {
                                            imageView.setImageResource(R.drawable.sem_6a_wednesday);
                                            btn.setOnClickListener(new View.OnClickListener() {
                                                @Override
                                                public void onClick(View v) {
                                                    Toast.makeText(it.this , "Set time wednesday",Toast.LENGTH_SHORT).show();
                                                    Intent intent = new Intent(it.this, F_WEN_R.class);
                                                    PendingIntent pendingIntent =   PendingIntent.getBroadcast(it.this,0,intent, PendingIntent.FLAG_IMMUTABLE);
                                                    AlarmManager alarmManager = (AlarmManager) getSystemService(ALARM_SERVICE);




                                                    Calendar istCalendar = Calendar.getInstance(TimeZone.getTimeZone("Asia/Kolkata"));
                                                    istCalendar.set(Calendar.HOUR_OF_DAY, 19); // 12 PM
                                                    istCalendar.set(Calendar.MINUTE, 24);       // 40 minutes
                                                    istCalendar.set(Calendar.SECOND, 0);        // 0 seconds
                                                    istCalendar.set(Calendar.MILLISECOND, 0);
                                                    long time = istCalendar.getTimeInMillis();
                                                    alarmManager.set(AlarmManager.RTC_WAKEUP,time,pendingIntent);
                                                    btn.setEnabled(true);

                                                }
                                            });
                                        }
                                        else if (position == 4) {
                                            imageView.setImageResource(R.drawable.sem_6a_thursday);
                                            btn.setOnClickListener(new View.OnClickListener() {
                                                @Override
                                                public void onClick(View v) {
                                                    Toast.makeText(it.this , "Set time thurday",Toast.LENGTH_SHORT).show();
                                                    Intent intent = new Intent(it.this, F_THU_R.class);
                                                    PendingIntent pendingIntent =   PendingIntent.getBroadcast(it.this,0,intent, PendingIntent.FLAG_IMMUTABLE);
                                                    AlarmManager alarmManager = (AlarmManager) getSystemService(ALARM_SERVICE);
                                                    long at = System.currentTimeMillis();
                                                    long bt = 1000*2;



                                                    Calendar istCalendar = Calendar.getInstance(TimeZone.getTimeZone("Asia/Kolkata"));
                                                    istCalendar.set(Calendar.HOUR_OF_DAY, 19); // 12 PM
                                                    istCalendar.set(Calendar.MINUTE, 24);       // 40 minutes
                                                    istCalendar.set(Calendar.SECOND, 0);        // 0 seconds
                                                    istCalendar.set(Calendar.MILLISECOND, 0);
                                                    long time = istCalendar.getTimeInMillis();

                                                    alarmManager.set(AlarmManager.RTC_WAKEUP,at+bt,pendingIntent);
                                                    btn.setEnabled(true);

                                                }
                                            });
                                        }
                                        else if (position == 5) {
                                            imageView.setImageResource(R.drawable.sem_6a_friday);
                                            btn.setOnClickListener(new View.OnClickListener() {
                                                @Override
                                                public void onClick(View v) {
                                                    Toast.makeText(it.this , "Set time friday",Toast.LENGTH_SHORT).show();
                                                    Intent intent = new Intent(it.this, F_FRI_R.class);
                                                    PendingIntent pendingIntent =   PendingIntent.getBroadcast(it.this,0,intent, PendingIntent.FLAG_IMMUTABLE);
                                                    AlarmManager alarmManager = (AlarmManager) getSystemService(ALARM_SERVICE);
                                                    long at = System.currentTimeMillis();
                                                    long bt = 1000*2;



                                                    Calendar istCalendar = Calendar.getInstance(TimeZone.getTimeZone("Asia/Kolkata"));
                                                    istCalendar.set(Calendar.HOUR_OF_DAY, 19); // 12 PM
                                                    istCalendar.set(Calendar.MINUTE, 24);       // 40 minutes
                                                    istCalendar.set(Calendar.SECOND, 0);        // 0 seconds
                                                    istCalendar.set(Calendar.MILLISECOND, 0);
                                                    long time = istCalendar.getTimeInMillis();

                                                    alarmManager.set(AlarmManager.RTC_WAKEUP,at+bt,pendingIntent);
                                                    btn.setEnabled(true);

                                                }
                                            });
                                        }
                                        else if (position == 6) {
                                            imageView.setImageResource(R.drawable.sem_6a_saturday);
                                            btn.setOnClickListener(new View.OnClickListener() {
                                                @Override
                                                public void onClick(View v) {
                                                    Toast.makeText(it.this , "Set time saturday",Toast.LENGTH_SHORT).show();
                                                    Intent intent = new Intent(it.this, F_SUT_R.class);
                                                    PendingIntent pendingIntent =   PendingIntent.getBroadcast(it.this,0,intent, PendingIntent.FLAG_IMMUTABLE);
                                                    AlarmManager alarmManager = (AlarmManager) getSystemService(ALARM_SERVICE);
                                                    long at = System.currentTimeMillis();
                                                    long bt = 1000*2;



                                                    Calendar istCalendar = Calendar.getInstance(TimeZone.getTimeZone("Asia/Kolkata"));
                                                    istCalendar.set(Calendar.HOUR_OF_DAY, 19); // 12 PM
                                                    istCalendar.set(Calendar.MINUTE, 24);       // 40 minutes
                                                    istCalendar.set(Calendar.SECOND, 0);        // 0 seconds
                                                    istCalendar.set(Calendar.MILLISECOND, 0);
                                                    long time = istCalendar.getTimeInMillis();

                                                    alarmManager.set(AlarmManager.RTC_WAKEUP,at+bt,pendingIntent);
                                                    btn.setEnabled(true);

                                                }
                                            });
                                        }
                                    }

                                    @Override
                                    public void onNothingSelected(AdapterView<?> parent) {
                                    }
                                });

                            }
                            //B6
                            else if (position == 2) {
                                s3.setAdapter(d1);
                                s3.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                    @Override
                                    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                                        if (position == 1) {
                                            imageView.setImageResource(R.drawable.no_data);
                                        } else if (position == 2) {
                                            imageView.setImageResource(R.drawable.no_data);
                                        } else if (position == 3) {
                                            imageView.setImageResource(R.drawable.no_data);
                                        } else if (position == 4) {
                                            imageView.setImageResource(R.drawable.no_data);
                                        } else if (position == 5) {
                                            imageView.setImageResource(R.drawable.no_data);
                                        } else if (position == 6) {
                                            imageView.setImageResource(R.drawable.no_data);
                                        }
                                    }

                                    @Override
                                    public void onNothingSelected(AdapterView<?> parent) {
                                    }
                                });

                            }
                        }

                        @Override
                        public void onNothingSelected(AdapterView<?> parent) {
                        }
                    });

                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });
    }

//6A
    private  void FAMON(){

        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.O) {
            CharSequence name ="yashkacha";
            String description = "yash kacha ";
            int importtance = NotificationManager.IMPORTANCE_HIGH;
            NotificationChannel channel = new NotificationChannel("1001",name , importtance);
            channel.setDescription(description);

            NotificationManager notificationManager = getSystemService(NotificationManager.class);
            notificationManager.createNotificationChannel(channel);
        }

    }

    private  void FATTUE(){

        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.O) {
            CharSequence name ="yashkacha";
            String description = "yash kacha ";
            int importtance = NotificationManager.IMPORTANCE_HIGH;
            NotificationChannel channel = new NotificationChannel("1002",name , importtance);
            channel.setDescription(description);

            NotificationManager notificationManager = getSystemService(NotificationManager.class);
            notificationManager.createNotificationChannel(channel);
        }

    }

    private  void FAFRI(){

        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.O) {
            CharSequence name ="yashkacha";
            String description = "yash kacha ";
            int importtance = NotificationManager.IMPORTANCE_HIGH;
            NotificationChannel channel = new NotificationChannel("1005",name , importtance);
            channel.setDescription(description);

            NotificationManager notificationManager = getSystemService(NotificationManager.class);
            notificationManager.createNotificationChannel(channel);
        }

    }


    private  void FASUT(){

        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.O) {
            CharSequence name ="yashkacha";
            String description = "yash kacha ";
            int importtance = NotificationManager.IMPORTANCE_HIGH;
            NotificationChannel channel = new NotificationChannel("1006",name , importtance);
            channel.setDescription(description);

            NotificationManager notificationManager = getSystemService(NotificationManager.class);
            notificationManager.createNotificationChannel(channel);
        }

    }


    private  void FATHU(){

        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.O) {
            CharSequence name ="yashkacha";
            String description = "yash kacha ";
            int importtance = NotificationManager.IMPORTANCE_HIGH;
            NotificationChannel channel = new NotificationChannel("1004",name , importtance);
            channel.setDescription(description);

            NotificationManager notificationManager = getSystemService(NotificationManager.class);
            notificationManager.createNotificationChannel(channel);
        }

    }

    private  void FAWEN(){

        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.O) {
            CharSequence name ="yashkacha";
            String description = "yash kacha ";
            int importtance = NotificationManager.IMPORTANCE_HIGH;
            NotificationChannel channel = new NotificationChannel("1003",name , importtance);
            channel.setDescription(description);

            NotificationManager notificationManager = getSystemService(NotificationManager.class);
            notificationManager.createNotificationChannel(channel);
        }

    }

//6B

}
