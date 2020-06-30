package com.example.androidbarberbooking.Interface;

import com.example.androidbarberbooking.Model.Banner;

import java.util.List;

public interface ILookBookLoadListener {
    void onLookBookLoadSuccess(List<Banner> banners);
    void onLookBookLoadFailed(String message);

}
