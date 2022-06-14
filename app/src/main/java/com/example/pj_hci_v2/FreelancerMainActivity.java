package com.example.pj_hci_v2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

public class FreelancerMainActivity extends AppCompatActivity {
    ArrayList<Freelancer> freelancerArrayList;
    Button btnQuaylai;
    TextView txtTieude, txtGiatien, txtNoidung, txtNgtuyendung, txtDiadiem, txtKynang, txtNgaydang;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_freelancer_main);

        RecyclerView rvFreelancer = findViewById(R.id.rvFreelancer);
        freelancerArrayList = new ArrayList<>();
        freelancerArrayList.add(new Freelancer("Viết bài PR bản thân", "200.000đ-250.000đ/bài", "Tôi cần viết bài pr bản thân để đăng báo, mục tiêu ca ngợi một nữ doanh nhân...", "Nhi Lê", "Toàn quốc", "Viết bài PR & Quảng cáo sáng tạo", "20/05/2022"));
        freelancerArrayList.add(new Freelancer("Viết content tiếng Anh mảng Coin, Crypto", "250.000-320.000/bài", "Mình tìm bạn viết Tiếng Anh, viết bài SEO cho website tiếng Anh về mảng coin...", "Trung Nguyên", "Toàn quốc", "Viết bài CEO, nội dung cho website", "26/05/2022"));
        freelancerArrayList.add(new Freelancer("Mình cần tìm một bạn Freelancer Edit Video - Podcast", "2.000.000-3.000.000/Video-Podcast", "Công việc phù hợp với bạn nào yêu thích và muốn tìm hiểu sâu về dinh dưỡng...", "Hoàng Hải", "Toàn quốc", "Làm video clip", "15/05/2022"));
        freelancerArrayList.add(new Freelancer("Binding dữ liệu ra frontend", "500.000-2.000.000/page", "Mình cần lập 2 pages, 1 page là list all object lấy được từ 1 api pages là...", "Tuấn Đặng", "Toàn quốc", "Lập trình web", "13/05/2022"));
        freelancerArrayList.add(new Freelancer("Chỉnh sữa mẫu logo săn có", "300.000-500.000/logo", "Cần tìm người thiết kế lại logo theo mẫu sẵn có. Mẫu có sẵn: htpp://i.igmur.com/9...", "Ngô Hoàng", "Toàn quốc", "Thiết kế Logo", "13/05/2022"));

        FreelancerAdapter freelancerAdapter = new FreelancerAdapter(freelancerArrayList);
        rvFreelancer.setAdapter(freelancerAdapter);
        rvFreelancer.setLayoutManager(new LinearLayoutManager(this));

        //Nút quay lại
        btnQuaylai = (Button) findViewById(R.id.buttonQuaylai);
        btnQuaylai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FreelancerMainActivity.this,Freelancer_P1.class);
                startActivity(intent);
            }
        });

        //Click vào nội dung để xem chi tiết
        public interfa




    }
}