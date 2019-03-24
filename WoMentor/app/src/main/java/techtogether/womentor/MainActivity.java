package techtogether.womentor;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ExpandableListView;
import android.widget.TextView;

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

        //IMPOSTER SYNDROME
        ArrayList<String> imposterSyndromResources = new ArrayList<>();

        /*Link to Overcoming I.S.*/
        imposterSyndromResources.add("-------------------------------------------------------------------------------- " +
                "\n Ways of Overcoming Imposter Syndrome from ADA Initiative: \n https://adainitiative.org/continue-our-work/impostor-syndrome-training/");
        /*Overview of Overcoming I.S.*/
        imposterSyndromResources.add("~~Imposter Syndrome: feeling that you aren’t actually qualified " +
                "for the work you are doing and will be discovered as a fraud \n\n " +
                "~~ Includes ~~ \n In-person training \n Guide to fighting impostor syndrome \n Writing exercises");
        /*Link to Overcoming Professional Insights*/
        imposterSyndromResources.add("\n -------------------------------------------------------------------------------- " +
                "\n Professional Insights on Imposter Syndrome: \n https://hbr.org/2008/05/overcoming-imposter-syndrome");
        /*Overview of Overcoming Professional Insights*/
        imposterSyndromResources.add("~~ Common Imposter Syndrome Thoughts ~~ "+
                "\n I must not fail \n I feel like a fake \n It’s all down to luck \n Success is no big deal " +
                "\n \n ~~ Overcoming Imposter Syndrome: " +
                "\n Recognise imposter feeings when they emerge \n Rewrite your mental programmes \n Talk about your feelings ");

        item.put("Imposter Syndrome", imposterSyndromResources);

        //ANXIETY
        ArrayList<String> anxietyResources = new ArrayList<>();
        /*Link to Anxiety & Depression in America*/
        anxietyResources.add("-------------------------------------------------------------------------------- " +
                "\n Anxiety and Depression Association of America: \n https://adaa.org/");
        /*Overview of Anxiety & Depression in America*/
        anxietyResources.add("~~ ADAA: international nonprofit membership organization and a leader " +
                "in education, training, and research for anxiety, depression and related disorders." +
                "\n\n ~~ Provides ~~ \n Anxiety and Depression Support Chat \n Tips to Manage Anxiety and Stress");
        /*Link to Info & Possible Treatments for Anxiety*/
        anxietyResources.add("-------------------------------------------------------------------------------- " +
                "\n Information and Possible Treatments for Anxiety: \n https://www.rtor.org/anxiety/");
        /*Overview of Info & Possible Treatments for Anxiety*/
        anxietyResources.add("~~ Anxiety Disorders ~~ \nGeneralized Anxiety Disorder (GAD)\n" +
                "Specific Phobias\n" +
                "Agoraphobia\n" +
                "Social Anxiety Disorder\n" +
                "Panic Disorder\n" +
                "Separation Anxiety Disorder\n" +
                "Selective Mutism Disorder");
        /* Link to More Resources*/
        anxietyResources.add("--------------------------------------------------------------------------------" +
                "\n More resources: \n https://nationalsocialanxietycenter.com/resources/");
        anxietyResources.add("~~ Resources ~~ \n Social Anxiety \n General \n CBT Organizations");
        /* Overview of More Resources */
        item.put("Anxiety", anxietyResources);

        //DEPRESSION
        ArrayList<String> depressionResources = new ArrayList<>();
        /*Link to Students With Depression*/
        depressionResources.add("--------------------------------------------------------------------------------" +
                "\n Students With Depression: " +
                "\n https://www.counseling.umd.edu/cs/facultystaff/studentsindistress/emotionaldistress/depressed");
        /*Overview of Students With Depression*/
        depressionResources.add("~~ Symptoms ~~ \n a deep sense of sadness \n irregular eating and sleeping \n an inability to experience pleasure" +
                "\n\n ~~ What to Do ~~ \n Talk to the student in private \n Ask the student if he/she has thoughts of suicide \n " +
                "Listen carefully and validate the student’s feelings and experiences");
        /*Link to NAMI*/
        depressionResources.add("--------------------------------------------------------------------------------" +
                "\n National Alliance on Mental Illness (NAMI): \n https://www.nami.org/");
        depressionResources.add("~~ NAMI Resources ~~ \n Video logs \n Blog posts \n You Are Not Alone");
        /*Link to To Write Love On Her Arms*/
        depressionResources.add("--------------------------------------------------------------------------------" +
                "\n To Write Love On Her Arms (TWLOHA): \n https://twloha.com/");
        depressionResources.add("~~ To Write Love on Her Arms: a non-profit movement dedicated to " +
                        "presenting hope and finding help for people struggling with depression, " +
                        "addiction, self-injury, and suicide" +
                "\n\n ~~ Message ~~ \n exists to encourage, inform, inspire, and also to invest directly into treatment and recovery.");

        item.put("Depression", depressionResources);

        MyExpandableListAdapter adapter = new MyExpandableListAdapter(item);
        expandableListView.setAdapter(adapter);

    }
}
