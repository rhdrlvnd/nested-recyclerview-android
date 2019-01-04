package lee.com.test;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class HorizontalActivity extends AppCompatActivity {

    @BindView(R.id.Hori_Recyclerview)
    RecyclerView mHori_Recyclerview;
    @BindView(R.id.Verti_Recyclerview)
    RecyclerView mVerti_Recyclerview;

    private HorizontalAdapter Hori_adapter;
    private VerticalAdapter Verti_adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vertical);
        ButterKnife.bind(this);

        List<Entity> list_1 = new ArrayList<>();
        for (int i = 1; i < 2; i++) {
            Entity entity_1 = new Entity();
            entity_1.title = "title" + i;
            List<Entity.InnerEntity> innerEntities = new ArrayList<>();
            for (int j = 1; j < 11; j++) {
                innerEntities.add(new Entity.InnerEntity(("Inner Title" + i + " - " + j), j % 3 == 0 ? R.mipmap.ic_launcher_round : R.mipmap.ic_launcher));
            }
            entity_1.innerEntities = innerEntities;
            list_1.add(entity_1);
        }

        List<Entity> list_2 = new ArrayList<>();
        for (int i = 1; i < 21; i++) {
            Entity entity_2 = new Entity();
            entity_2.title = "title" + i;
            List<Entity.InnerEntity> innerEntities = new ArrayList<>();
            for (int j = 1; j < 11; j++) {
                innerEntities.add(new Entity.InnerEntity(("Inner Title" + i + " - " + j), j % 3 == 0 ? R.mipmap.ic_launcher_round : R.mipmap.ic_launcher));
            }
            entity_2.innerEntities = innerEntities;
            list_2.add(entity_2);
        }

        Hori_adapter = new HorizontalAdapter(list_1);
        Verti_adapter = new VerticalAdapter(list_2);
        mVerti_Recyclerview.setAdapter(Verti_adapter);
        mVerti_Recyclerview.setLayoutManager(new LinearLayoutManager(this));
        mHori_Recyclerview.setAdapter(Hori_adapter);
        mHori_Recyclerview.setLayoutManager(new LinearLayoutManager(this));

    }
}
