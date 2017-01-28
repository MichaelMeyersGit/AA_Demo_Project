package de.mm.aademo.android.activity;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/*import com.google.android.gms.maps.*;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions; */

import de.mm.aademo.android.R;
import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.EFragment;
import org.androidannotations.annotations.ViewById;

/**
 *
 * http://blog.skypayjm.com/2015/07/implementing-google-v2-mapview-in.html
 *
 */
@EFragment(R.layout.fragment_map)
public class MapFragment extends Fragment {

//    @ViewById(R.id.mapView)
//    MapView mapView;

   // private GoogleMap googleMap;



    public MapFragment() {
        // Required empty public constructor
    }


  /*  @AfterViews
    void afterViews() {
        mapView.onCreate(null);
        mapView.onResume();// needed to get the map to display immediately
         try {
            MapsInitializer.initialize(getActivity().getApplicationContext());
    } catch (Exception e) {
        e.printStackTrace();
    }
    mapView.getMapAsync(new OnMapReadyCallback() {
        @Override
        public void onMapReady(GoogleMap googleMap) {
            double latitude = 1.3667;
            double longitude = 103.8;
            // create marker
            MarkerOptions marker = new MarkerOptions().position(new LatLng(latitude, longitude)).title("Hello Maps");

            // Changing marker icon
             marker.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE));

            // adding marker
              googleMap.addMarker(marker);
            CameraPosition cameraPosition = new CameraPosition.Builder().target(new LatLng(latitude, longitude)).zoom(12).build();
            googleMap.animateCamera(CameraUpdateFactory.newCameraPosition(cameraPosition));
        }
    });
    // latitude and longitud





    } */

    @Override    public void onResume() {
        super.onResume();
//        mapView.onResume();
    }





}
