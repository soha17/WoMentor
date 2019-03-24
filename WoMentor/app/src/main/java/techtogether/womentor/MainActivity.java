package techtogether.womentor;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ExpandableListView;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ExpandableListView expandableListView = findViewById(R.id.expandListView);

        HashMap<String, List<String>> item = new HashMap<>();

        ArrayList<String> imposterSyndromResources = new ArrayList<>();
        imposterSyndromResources.add("Ways of Overcoming Imposter Syndrome from ADA Initiative: \n https://adainitiative.org/continue-our-work/impostor-syndrome-training/");
        imposterSyndromResources.add("Professional Insights on Imposter Syndrome: \n https://hbr.org/2008/05/overcoming-imposter-syndrome");

        item.put("Imposter Syndrome", imposterSyndromResources);

        ArrayList<String> anxietyResources = new ArrayList<>();
        anxietyResources.add("Anxiety and Depression Association of America: \n https://adaa.org/");
        anxietyResources.add("Information and Possible Treatments for Anxiety: \n https://www.rtor.org/anxiety/");
        anxietyResources.add("More resources: \n https://nationalsocialanxietycenter.com/resources/");

        item.put("Anxiety", anxietyResources);

        ArrayList<String> depressionResources = new ArrayList<>();

        depressionResources.add("National Alliance on Mental Illness (NAMI): \n https://www.nami.org/");
        depressionResources.add("To Write Love On Her Arms (TWLOHA): \n https://twloha.com/");
        depressionResources.add("Mental Health First Aid: \n https://www.mentalhealthfirstaid.org/");

        item.put("Depression", depressionResources);

        MyExpandableListAdapter adapter = new MyExpandableListAdapter(item);
        expandableListView.setAdapter(adapter);
    }
}
