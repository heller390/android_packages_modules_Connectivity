package android.net;

import android.annotation.NonNull;
import android.annotation.Nullable;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Handler;

/**
 * ConnectivityManager for apps that expect to always have the INTERNET permission, but have it
 * revoked.
 *
 * @hide
 * */
public class ConnectivityManagerInternetCompat extends ConnectivityManager {

    ConnectivityManagerInternetCompat(Context ctx, IConnectivityManager service) {
        super(ctx, service);
    }

    @Override
    public void reportNetworkConnectivity(@Nullable Network network, boolean hasConnectivity) {
    }

    @Nullable
    @Override
    public NetworkInfo getActiveNetworkInfo() {
        return null;
    }

    @Nullable
    @Override
    public Network getActiveNetwork() {
        return null;
    }

    @Nullable
    @Override
    public NetworkInfo getNetworkInfo(int networkType) {
        return null;
    }

    @Nullable
    @Override
    public NetworkInfo getNetworkInfo(@Nullable Network network) {
        return null;
    }

    @NonNull
    @Override
    public NetworkInfo[] getAllNetworkInfo() {
        return new NetworkInfo[0];
    }

    @Override
    public Network getNetworkForType(int networkType) {
        return null;
    }

    @NonNull
    @Override
    public Network[] getAllNetworks() {
        return new Network[0];
    }

    @Override
    public LinkProperties getActiveLinkProperties() {
        return null;
    }

    @Nullable
    @Override
    public LinkProperties getLinkProperties(@Nullable Network network) {
        return null;
    }

    @Override
    public LinkProperties getLinkProperties(int networkType) {
        return null;
    }

    @Nullable
    @Override
    public NetworkCapabilities getNetworkCapabilities(@Nullable Network network) {
        return null;
    }

    @Override
    public String[] getTetherableIfaces() {
        return new String[0];
    }

    @Override
    public String[] getTetheredIfaces() {
        return new String[0];
    }

    @Override
    public String[] getTetheringErroredIfaces() {
        return new String[0];
    }

    @Override
    public String[] getTetherableUsbRegexs() {
        return new String[0];
    }

    @Override
    public String[] getTetherableWifiRegexs() {
        return new String[0];
    }

    @Override
    public String[] getTetherableBluetoothRegexs() {
        return new String[0];
    }

    @Override
    public int getLastTetherError(String iface) {
        return TetheringManager.TETHER_ERROR_UNKNOWN_IFACE;
    }

    @Override
    public boolean isNetworkSupported(int networkType) {
        return false;
    }

    @Override
    public boolean isActiveNetworkMetered() {
        return false;
    }

    @Override
    public void registerNetworkCallback(@NonNull NetworkRequest request, @NonNull NetworkCallback networkCallback) {}

    @Override
    public void registerNetworkCallback(@NonNull NetworkRequest request, @NonNull NetworkCallback networkCallback, @NonNull Handler handler) {}

    @Override
    public void unregisterNetworkCallback(@NonNull NetworkCallback networkCallback) {}

    @Override
    public void registerNetworkCallback(@NonNull NetworkRequest request, @NonNull PendingIntent operation) {}

    @Override
    public void registerDefaultNetworkCallback(@NonNull NetworkCallback networkCallback) {}

    @Override
    public void registerDefaultNetworkCallback(@NonNull NetworkCallback networkCallback, @NonNull Handler handler) {}

    @Override
    public void registerBestMatchingNetworkCallback(@NonNull NetworkRequest request, @NonNull NetworkCallback networkCallback, @NonNull Handler handler) {}

    @Override
    public boolean requestBandwidthUpdate(@NonNull Network network) {
        return false;
    }

    @Override
    public void unregisterNetworkCallback(@NonNull PendingIntent operation) {}

    @Override
    public void releaseNetworkRequest(@NonNull PendingIntent operation) {}

    @Override
    public int getMultipathPreference(@Nullable Network network) {
        return 0;
    }

    @Override
    public int getNetworkPreference() {
        return TYPE_NONE;
    }
}
