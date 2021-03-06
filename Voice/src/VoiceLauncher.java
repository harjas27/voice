//Imports
import edu.cmu.sphinx.api.Configuration;
import edu.cmu.sphinx.api.LiveSpeechRecognizer;
import edu.cmu.sphinx.api.SpeechResult;
import java.io.IOException;

/**
 *
 * @author ex094
 */
public class VoiceLauncher {
    public static void main(String[] args) throws IOException {
        // Configuration Object
        Configuration configuration = new Configuration();

        // Set path to the acoustic model.
        configuration.setAcousticModelPath("resource:/edu/cmu/sphinx/models/en-us/en-us");
        // Set path to the dictionary.
        configuration.setDictionaryPath("b.dic");
        // Set path to the language model.
        configuration.setLanguageModelPath("a.lm");
        //Recognizer Object, Pass the Configuration object
        LiveSpeechRecognizer recognize = new LiveSpeechRecognizer(configuration);

        //Start Recognition Process (The bool parameter clears the previous cache if true)
        recognize.startRecognition(true);
        
        SpeechResult result;

        //Checking if recognizer has recognized the speech
        while ((result = recognize.getResult()) != null) {
            //Get the recognize speech
            String command = result.getHypothesis();
        }
    
    
    }
 }

