package mmokrousov.ApiHelper;

import org.apache.http.HttpStatus;

import java.util.UUID;

public class Constants {
    public static final String Authorization = "eyJhbGciOiJSUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VyX25hbWUiOiJORU8wMTAwIiwicm9sZXMiOlsiQm5rR296T3BlcmF0b3JEQk8yIiwiT3BlcmF0b3JEQk8yIiwiQm5rMjE0T3BlcmF0b3JEQk8yIl0sIndvcmtzdGF0aW9uIjoiQkFOSyIsInNlc3Npb25JZCI6ImNkYmE0OTZjLWYxYjUtNGM4ZS04MDQ1LTQwODVmNGRmMTEyOCIsImNuIjoiWnViYXIgT3BlciIsInNlc3Npb25EdXJhdGlvbiI6OTAwLCJ0aXRsZSI6ItGB0L_QtdGG0LjQsNC70LjRgdGCIiwidG9rZW5fdHlwZSI6Ik9GRklDSUFMIiwiY2xpZW50X2lkIjoidnRiI2FkbSIsInVpZCI6Ik5FTzAxMDAiLCJzdWIiOiJwcml2aWxlZ2UiLCJzY29wZSI6WyJ2dGItYWRtIl0sImxvY2F0aW9uIjoiaHR0cDovL2ZlLXJvb3QtYmFuay1pdGVyYXRpb24uZHM1LWdlbnIwMi1kYm9yLWJzazItdGVzdC5zaGFyZDEuZHM1LWdlbnIwMi5jb3JwLmRldi52dGIvIiwiZXhwaXJhdGlvbiI6MzAwLCJleHAiOjE2NTI0MjM5ODgsImp0aSI6IjI5ZTIwNTVlLTNmYjMtNDk3OS1iOWU2LTBkZTM1ZTI1M2JhNyIsInRlY2hfdXNlciI6ZmFsc2UsImN0eGkiOiIxMjM0NTY3ODkiLCJpcCI6IjE5Mi4xNjguMS4xIiwiY2hhbm5lbCI6ImludGVybmFsIn0.n95dl036ycHO7oVsvudVRxy6dtvMDvshykmjxdQEtBBWvf_g0V3p557zzN8K23xo8-2-d94ItvVjTNSet-MFo5Qxb9eP0mM03nksL7zN5gkfJxASWHlcUrvwRdLHJXTE7FYXDPZDrq6-GUif6AZ0esJZ5GjCt2dPsqWBZ34DkXQB38lCOLAHAkRek17QPSyIyzCc7B2ybBpuMHxYDymwFN48BTaflqiezIX61D_NXsHQW5sbygxd-mty-SKs7KxW-ZBD5_oUFTV4Wh-seX0g9W8cK4Uzj1_O2qCkxZrhlzpDBiIuGusLyVntpO2kApBd2uYOkbHJbuxSidBlX5iQfA";
    public static final String x_session_id = UUID.randomUUID().toString();
    public static final String x_epa_sub = "prime";
    public static final String x_epa_ctxi = UUID.randomUUID().toString();
    public static final String x_epa_ip = UUID.randomUUID().toString();
    public static final String x_epa_channel = "internal";
    public static final String x_epa_jti = UUID.randomUUID().toString();
    public static final String X_Initiator_Host = "vtb.ru";
    public static final String X_Initiator_Service = "Minerva";
    public static final String X_Mdm_Id = "1085515039";
    public static final String X_UNC = "11966058";
    public static final String symbolIs256 = "2562562562562562562562562562562562562562562562562562562562562562562562562562562562562562562562562562562562562562562562562562562562562562562562562562562562562562562562562562562562562562562562562562562562562562562562562562562562562562562562562562562562562562";
    public static final String symbolIs51 = "1234567891011213141516171819202122232425262728293040";

    public static final int OK = HttpStatus.SC_OK;
    public static final int BAD_REQUEST = HttpStatus.SC_BAD_REQUEST;
    public static final int UNPROCESSABLE_ENTITY = HttpStatus.SC_UNPROCESSABLE_ENTITY;
    public static final int UNATHORIZED = HttpStatus.SC_UNAUTHORIZED;
    public static final int ITERNAL_SERVER_ERROR = HttpStatus.SC_INTERNAL_SERVER_ERROR;
}
