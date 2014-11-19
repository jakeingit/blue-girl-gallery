
package com.jakegosskuehn.basicgallery;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View.OnClickListener;
import android.widget.AdapterView;

import android.widget.AdapterView.OnItemClickListener;
import android.widget.Gallery;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity<View> extends Activity 
{

     ImageView selectedImage;  
     private Integer[] mImageIds = {
             R.drawable.image1,
             R.drawable.image2,
             R.drawable.image3,
             R.drawable.image4,
             R.drawable.image5,
             R.drawable.image6,
             R.drawable.image7,
             R.drawable.image8,
             R.drawable.image9,
             R.drawable.image10,
             R.drawable.image11,
             R.drawable.image12,
             R.drawable.image13,
             R.drawable.image14,
             R.drawable.image15,
             R.drawable.image16,
             R.drawable.image17,
             R.drawable.image18,
             R.drawable.image19,
             R.drawable.image20,
             R.drawable.image21,
             R.drawable.image22,
             R.drawable.image23,
             R.drawable.image24,
             R.drawable.image25,
             R.drawable.image26,
             R.drawable.image27,
             R.drawable.image28,
             R.drawable.image29,
             R.drawable.image30,
             R.drawable.image31,
             R.drawable.image32,
             R.drawable.image33,
             R.drawable.image34,
             R.drawable.image35,
             R.drawable.image36,
             R.drawable.image37,
             R.drawable.image38,
             R.drawable.image39,
             R.drawable.image40,
             R.drawable.image41,
             R.drawable.image42,
             R.drawable.image43,
             R.drawable.image44,
             R.drawable.image45,
             R.drawable.image46,
             R.drawable.image47,
             R.drawable.image48,
             R.drawable.image49,
             R.drawable.image50,
             R.drawable.image51,
             R.drawable.image52,
             R.drawable.image53,
             R.drawable.image54,
             R.drawable.image55

        };
    @Override
    public void onCreate(Bundle savedInstanceState) 
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       
             Gallery gallery = (Gallery) findViewById(R.id.gallery1);
        selectedImage=(ImageView)findViewById(R.id.imageView1);
        gallery.setSpacing(1);
       
        gallery.setAdapter(new GalleryImageAdapter(this));
//        gallery.setAdapter(new GalleryImageAdapter(this, mImageIds)); // from thread

        //GALLERY CLICKLISTERER
        gallery.setOnItemClickListener(new OnItemClickListener() {
           
//            
//            public void onItemClick(AdapterView<?> parent, View v, int position, long id) {
//                Toast.makeText(MainActivity.this, "THIS TEXT SHOULD NEVER SHOW = " + position, Toast.LENGTH_SHORT).show();
//                // show the selected Image
//                selectedImage.setImageResource(mImageIds[position]);
//            }
//
//            
            
            @Override
            public void onItemClick(AdapterView<?> parent, android.view.View v, int position, long id) {
                String nameGotten = getname(position);
//                Toast.makeText(MainActivity.this, "Name: " + nameGotten, Toast.LENGTH_SHORT).show();
                // show the selected Image
                selectedImage.setImageResource(mImageIds[position]);
                
            }
            
            
            
        });
        //IMAGEVIEW CLICKLISTENER
        selectedImage.setClickable(true);
        selectedImage.setOnClickListener(new OnClickListener() {    

            
            @Override
            public void onClick(android.view.View arg0) {
                // TODO Auto-generated method stub
                Toast.makeText(MainActivity.this, "Swipe through on the top to browse.", Toast.LENGTH_SHORT).show();
            }
            
            
        });
    }
    
    public String getname(int number){
        String namereturn = "";
        switch(number){
        case 0: namereturn = "Anne";
        break;
        case 1: namereturn = "Betty";
        break;
        case 2: namereturn = "Cherise";
        break;
        case 3: namereturn = "Delana";
        break;
        case 4: namereturn = "Eui";
        break;
        case 5: namereturn = "Fransica";
        break;
        case 6: namereturn = "Galena";
        break;
        case 7: namereturn = "Helana";
        break;
        case 8: namereturn = "Issie";
        break;
        case 9: namereturn = "Janice";
        break;
        }
        return namereturn;
        }
}

        


