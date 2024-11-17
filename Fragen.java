import java.util.Arrays;

public class Fragen {
  // start attributes
  private final String[] questions;
  private final String[][] answers;
  private final int[] correctAnswers;
  // end attributes
  
  public Fragen() {
    questions = new String[]{
    "Welche Farbe hat eine reife Banane?",
    "Welches Tier miaut normalerweise?",
    "Welches ist das höchste Gebäude der Welt?",
    "Welche Planeten befinden sich zwischen Mars und Uranus?",
    "Wie viele Beine hat eine Spinne normalerweise?",
    "Welches ist das größte Meer der Welt?",
    "Welche dieser Farben ist eine Primärfarbe?",
    "Wer schrieb 'Romeo und Julia'?",
    "Welches ist das schnellste Landtier?",
    "Wie viele Kontinente gibt es?",
    "Welches ist das kleinste Säugetier der Welt?",
    "Was ist das größte Organ des menschlichen Körpers?",
    "Welcher Ozean grenzt an die Westküste der Vereinigten Staaten?",
    "Welches Land hat die meisten Einwohner?",
    "Welches Tier symbolisiert Weisheit?",
    "Welche Jahreszeit folgt auf den Herbst?",
    "Welches Element hat die chemische Bezeichnung 'H'?",
    "Welches Land ist für seine Pyramiden bekannt?",
    "Wie viele Zähne hat ein erwachsener Mensch normalerweise?",
    "Welches Tier legt keine Eier?",
    "Welche Hauptstadt hat die Fläche von 891,8 km²?",
    "Welcher Planet ist der kleinste in unserem Sonnensystem?",
    "Welches Land hat die längste Landgrenze?",
    "Wie viele Zeitzonen gibt es auf der Welt?",
    "Was ist die Hauptkomponente der Luft?",
    "Was ist die chemische Formel für Wasser?",
    "Welcher Fluss ist der längste der Welt?",
    "Was ist die Hauptstadt von Australien?",
    "Welche ist die längste Schlange der Welt?",
    "Was ist der chemische Name für Salz?",
    "Was ist die höchste Bergkette der Welt?",
    "Wie heißt die berühmteste Uhr der Welt?",
    "Was ist der größte See der Welt?",
    "Welcher Planet hat die meisten Monde?",
    "Was ist die offizielle Sprache von Brasilien?",
    "Was ist der bekannteste Nationalpark der USA?",
    "Wie heißt die Wissenschaft von der Erforschung des Weltraums?",
    "Welches Element ist das zweithäufigste im Erdmantel?",
    "Wo befindet sich das Tal des Todes?",
    "Was ist der bekannteste Buchtitel von Jules Verne?",
    "Wie lautet die älteste bekannte schriftliche Sprache der Menschheit?",
    "Welches ist das kleinste Land der Welt?",
    "Wer ist der einzige Mensch, der jemals einen offiziellen Kriegseinsatz gegen die USA angeordnet hat?",
    "Welcher Krieg gilt als der längste Krieg der Geschichte?",
    "Welches Land besitzt als ältestes die Staatsform der Demokratie?",
    "Wer war der erste Mensch im Weltall?",
    "Was ist der tiefste Punkt auf der Erde?",
    "Welches Tier hat den längsten Schwanz im Verhältnis zu seiner Körpergröße?",
    "Welcher Planet ist der nächste zum Sonnensystem der Erde?",
    "Wer wurde Torschützenkönig der Bundesliga in der Saison 2014/2015?",
    "Was ist die chemische Formel für Tafelwasser?",
    "Welches ist das kleinste Säugetier der Welt?",
    "Welches Land hat die meisten UNESCO-Welterbestätten?",
    "Welches Tier hat den größten Herzschlag pro Minute?",
    "Welches Land hat den längsten unbebauten Strand?",
    "Wer ist der einzige Präsident der USA, der mehr als zwei Amtszeiten gedient hat?",
    " Welches Tier hat die größten Augen im Verhältnis zu seiner Körpergröße?",
    "Welches Land hat den höchsten Pro-Kopf-Verbrauch an Schokolade?",
    "Was ist das härteste natürlich vorkommende Material auf der Erde?",
    "Wer war der erste Mensch, der den Mount Everest bestieg?",
    "Was ist die Hauptstadt von Honduras?"
    };
    
    answers = new String[][]{
    {"Rot", "Blau", "Gelb", "Grün"},
    {"Hund", "Katze", "Vogel", "Frosch"},
    {"Eiffelturm", "Empire State Building", "Burj Khalifa", "Shanghai Tower"},
    {"Jupiter und Saturn", "Venus und Saturn", "Saturn und Uranus", "Mars und Venus"},
    {"Sechs", "Vier", "Acht", "Zehn"},
    {"Mittelmeer", "Karibisches Meer", "Südchinesisches Meer", "Pazifischer Ozean"},
    {"Orange", "Grün", "Lila", "Blau"},
    {"William Shakespeare", "Charles Dickens", "Jane Austen", "Mark Twain"},
    {"Gepard", "Löwe", "Elefant", "Nashorn"},
    {"4", "5", "6", "7"},
    {"Elefant", "Maus", "Nashorn", "Blauwal"},
    {"Herz", "Gehirn", "Lunge", "Haut"},
    {"Pazifischer Ozean", "Atlantischer Ozean", "Indischer Ozean", "Arktischer Ozean"},
    {"China", "Indien", "Vereinigte Staaten", "Russland"},
    {"Eule", "Fuchs", "Adler", "Löwe"},
    {"Frühling", "Winter", "Sommer", "Regenzeit"},
    {"Wasserstoff", "Sauerstoff", "Kohlenstoff", "Stickstoff"},
    {"Brasilien", "Italien", "Ägypten", "Griechenland"},
    {"20", "24", "28", "32"},
    {"Ente", "Schlange", "Hai", "Orca"},
    {"Berlin", "Paris", "Madrid", "Rom"},
    {"Merkur", "Venus", "Mars", "Pluto"},
    {"Russland", "Kanada", "China", "Indien"},
    {"12", "24", "36", "48"},
    {"Stickstoff", "Kohlenstoff", "Sauerstoff", "Wasserstoff"},
    {"H2O", "CO2", "O2", "NaCl"},
    {"Amazonas", "Nil", "Jangtse", "Mississippi"},
    {"Perth", "Sydney", "Melbourne", "Canberra"},
    {"Anakonda", "Königskobra", "Python", "Schwarze Mamba"},
    {"Eisen(III)chlorid", "Kaliumchlorid", "Natriumchlorid", "Calciumchlorid"},
    {"Anden", "Rockies", "Himalaya", "Alpen"},
    {"Big Ben", "Sonnenuhr", "Rolex", "Uhr des Königs"},
    {"Genfer See", "Lake Superior", "Kaspisches Meer", "Victoria-See"},
    {"Saturn", "Uranus", "Jupiter", "Neptun"},
    {"Spanisch", "Portugiesisch", "Französisch", "Englisch"},
    {"Yellowstone", "Yosemite Nationalpark", "Grand Canyon", "Wrangell-St.-Elias-Nationalpark"},
    {"Astronomie", "Astrophysik", "Kosmologie", "Astrologie"},
    {"Kobalt", "Eisen", "Aluminium", "Silizium"},
    {"Arizona", "Kalifornien", "Utah", "Nevada"},
    {"Reise um die Erde", "Reise zum Mittelpunkt der Erde", "20.000 Meilen unter dem Meer", "Die geheimnisvolle Insel"},
    {"Sumerisch", "Akkadisch", "Gubbiisch", "Hebräisch"},
    {"Vatikanstadt", "Monaco", "Nauru", "Tuvalu"},
    {"Hirohito", "Napoleon Bonaparte", "Kaiser Wilhelm II", "Winston Churchill"},
    {"Sudanischer Bürgerkrieg", "Der Hundertjährige Krieg", "Achsenmächte gegen Alliierte", "Peloponnesischer Krieg"},
    {"Athen", "Rom", "USA", "Frankreich"},
    {"Lewis Wattkins", "Neil Armstrong", "Juri Gagarin", "Yuri Malenchenko"},
    {"Tiefsee von Puerto Rico", "Marianengraben", "Java-Tiefsee", "Philippinengraben"},
    {"Stummelschwanzkatzen", "Schmetterlingsfisch", "südamerikanische Gürteltier", "Axolotl"},
    {"Venus", "Mars", "Merkur", "Jupiter"},
    {"Robert Lewandowski", "Alexander Meier", "Aubameyang", "Robben"},
    {"Gold", "Platin", "Iridium", "Quecksilber"},
    {"Rod Laver", "Roger Federer", "Roy Emerson", "Rafael Nadal"},
    {"Deutschland", "China", "Mexiko", "Italien"},
    {"Kolibri", "Gepard", "Blaue Hering", "Spitzmaus"},
    {"Bangladesch", "Australien", "Kanada", "Brasilien"},
    {"George Washington", "Franklin D. Roosevelt", "Abraham Lincoln", "Thomas Jefferson"},
    {"Muräne", "Riesensepien", "Riesenkalmar", "Koloss-Kalmar"},
    {"Liechtenstein", "Deutschland", "Belgien", "Schweiz"},
    {"Grundgestein", "Diamant", "Topas", "Saphir"},
    {"Sir Edmund Hillary", "Tenzing Norgay", "Reinhold Messner", "Hillary Step"},
    {"La Ceiba", "Choloma", "Tegucigalpa", "San Diaz"}
    };
    
    correctAnswers = new int[]{
    3, // Welche Farbe hat eine reife Banane? - Gelb
    2, // Welches Tier miaut normalerweise? - Katze
    3, // Welches ist das höchste Gebäude der Welt? - Burj Khalifa
    2, // Welche Planeten befinden sich zwischen Mars und Uranus? - Venus und Saturn
    1, // Wie viele Beine hat eine Spinne normalerweise? - Sechs
    4, // Welches ist das größte Meer der Welt? - Pazifischer Ozean
    4, // Welche dieser Farben ist eine Primärfarbe? - Blau
    1, // Wer schrieb 'Romeo und Julia'? - William Shakespeare
    1, // Welches ist das schnellste Landtier? - Gepard
    4, // Wie viele Kontinente gibt es? - Sieben
    2, // Welches ist das kleinste Säugetier der Welt? - Maus
    4, // Was ist das größte Organ des menschlichen Körpers? - Haut
    1, // Welcher Ozean grenzt an die Westküste der Vereinigten Staaten? - Pazifischer Ozean
    1, // Welches Land hat die meisten Einwohner? - China
    1, // Welches Tier symbolisiert Weisheit? - Eule
    2, // Welche Jahreszeit folgt auf den Herbst? - Winter
    1, // Welches Element hat die chemische Bezeichnung 'H'? - Wasserstoff
    3, // Welches Land ist für seine Pyramiden bekannt? - Ägypten
    4, // Wie viele Zähne hat ein erwachsener Mensch normalerweise? - 32
    4, // Welches Tier legt keine Eier? - Orca
    1, // Welche Hauptstadt hat die Fläche von 891,8 km²? - Berlin
    1, // Welcher Planet ist der kleinste in unserem Sonnensystem? - Merkur
    2, // Welches Land hat die längste Landgrenze? - Kanada
    2, // Wie viele Zeitzonen gibt es auf der Welt? - 24
    4, // Was ist die Hauptkomponente der Luft? - Stickstoff
    1, // Was ist die chemische Formel für Wasser? - H2O
    2, // Welcher Fluss ist der längste der Welt? - Nil
    4, // Was ist die Hauptstadt von Australien? - Canberra
    1, // Welche ist die längste Schlange der Welt? - Anakonda
    1, // Was ist der chemische Name für Salz? - Natriumchlorid
    3, // Was ist die höchste Bergkette der Welt? - Himalaya
    1, // Wie heißt die berühmteste Uhr der Welt? - Big Ben
    1, // Was ist der größte See der Welt? - Kaspisches Meer
    3, // Welcher Planet hat die meisten Monde? - Jupiter
    2, // Was ist die offizielle Sprache von Brasilien? - Portugiesisch
    4, // Was ist der größte Nationalpark der USA? - Wrangell-St.-Elias-Nationalpark
    2, // Wie heißt die Wissenschaft von der Erforschung des Weltraums? - Astrophysik
    4, // Welches Element ist das zweithäufigste im Erdmantel? - Silizium
    2, // Wo befindet sich das Tal des Todes? - Kalifornien
    3, // Was ist der bekannteste Buchtitel von Jules Verne? - 20.000 Meilen unter dem Meer
    1, // Wie lautet die älteste bekannte schriftliche Sprache der Menschheit? - Sumerisch
    1, // Welches ist das kleinste Land der Welt? - Vatikanstadt
    1, // Wer ist der einzige Mensch, der jemals einen offiziellen Kriegseinsatz gegen die USA angeordnet hat? - Hirohito
    3, // Welcher Krieg gilt als der längste Krieg der Geschichte? - Der Hundertjährige Krieg
    1, // Welches Land besitzt als ältestes die Staatsform der Demokratie? - USA
    4, // Wer war der erste Mensch im Weltall? - Juri Gagarin
    2, // Was ist der tiefste Punkt auf der Erde? - Marianengraben
    3, // Welches Tier hat den längsten Schwanz im Verhältnis zu seiner Körpergröße? - südamerikanische Gürteltier
    1, // Welcher Planet ist der nächste zum Sonnensystem der Erde? - Venus
    2, // Wer wurde Torschützenkönig der Bundesliga in der Saison 2014/2015? - Alexander Meier
    2, // Welches der folgenden Elemente ist das seltenste in der Erdkruste? - Platin
    3, // Welcher Tennisspieler hat als erster sowohl in seiner Einzel- als auch in seiner Doppelkarriere alle vier Grand-Slam-Turniere gewonnen? - Roy Emerson
    4, // Welches Land hat die meisten UNESCO-Welterbestätten? - Italien
    1, // Welches Tier hat den größten Herzschlag pro Minute? - Kolibri
    1, // Welches Land hat den längsten unbebauten Strand? - Bangladesch
    2, // Wer ist der einzige Präsident der USA, der mehr als zwei Amtszeiten gedient hat? - Franklin D. Roosevelt
    3, // Welches Tier hat die größten Augen im Verhältnis zu seiner Körpergröße? - Riesenkalmar
    4, // Welches Land hat den höchsten Pro-Kopf-Verbrauch an Schokolade? - Schweiz
    2, // Was ist das härteste natürlich vorkommende Material auf der Erde? - Diamant
    1, // Wer war der erste Mensch, der den Mount Everest bestieg? - Sir Edmund Hillary
    3, // Was ist die Hauptstadt von Honduras? - Tegucigalpa
    };
  } 
  
  // start methods
  public String[] getQuestions() {
    return Arrays.copyOf(questions, questions.length);
  }
  
  public String[][] getAnswers() {
    String[][] copy = new String[answers.length][];
    for (int i = 0; i < answers.length; i++) {
      copy[i] = Arrays.copyOf(answers[i], answers[i].length);
    }
    return copy;
  }
  
  public int[] getCorrectAnswers() {
    return Arrays.copyOf(correctAnswers, correctAnswers.length);
  }                                 
  // end methods
}
