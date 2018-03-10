package infosolution.dev.com.customnavigation;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by shreyansh on 3/8/2018.
 */

public class NavPanelListAdapter extends BaseAdapter {

    private Context context;
    private LayoutInflater inflater = null;

    String[] menus = {"A","B","C","D","E"};
    int[] menuImg = {

           R.mipmap.ic_launcher_round,
            R.mipmap.ic_launcher_round,
            R.mipmap.ic_launcher_round,
            R.mipmap.ic_launcher_round,
            R.mipmap.ic_launcher_round};

            NavPanelListAdapter(Context con, String[] menus) {

            this.context = con;
            menus = menus;
            inflater = LayoutInflater.from(context);
            }

@Override
public int getCount() {
        return menus.length;
        }

@Override
public Object getItem(int i) {
        return menus.length;
        }

@Override
public long getItemId(int i) {
        return i;
        }

@Override
public View getView(int i, View convertview, ViewGroup viewGroup) {
        ViewHolder holder;
        if(convertview == null) {

        convertview =inflater.inflate(R.layout.nav_list_template,null);
        holder = new ViewHolder();
        holder.imgMenu = (ImageView) convertview.findViewById(R.id.menu_img);
        holder.txtMenu = (TextView) convertview.findViewById(R.id.mene_id);
        convertview.setTag(holder);

        } else {
        holder = (ViewHolder) convertview.getTag();
        }

        holder.txtMenu.setText(menus[i]);
        holder.imgMenu.setImageResource(menuImg[i]);
        return convertview;
        }

public class ViewHolder {

    ImageView imgMenu;
    TextView txtMenu;

}
}