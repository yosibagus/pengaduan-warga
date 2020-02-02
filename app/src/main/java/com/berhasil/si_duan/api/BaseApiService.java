package com.berhasil.si_duan.api;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface BaseApiService {

    @FormUrlEncoded
    @POST("addPelaporanUser.php")
    Call<ResponseBody> addPelaporan (
        @Field("IMG_LAPORAN") String imgLaporan,
        @Field("KET_LAPORAN") String ketLaporan,
        @Field("LOKASI_LAPORAN") String lokasiLaporan
    );

}
