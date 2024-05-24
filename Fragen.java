import java.util.Arrays;

public class Fragen {
  
  private String[] questions;
  private String[][] answers;
  private int[] correctAnswers;
  
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
    "Was war das erste Land, das eine Demokratie hatte?",
    "Wer war der erste Mensch im Weltall?",
    "Was ist der tiefste Punkt auf der Erde?",
    "Welches Tier hat den längsten Schwanz im Verhältnis zu seiner Körpergröße?",
    "Welcher Planet ist der nächste zum Sonnensystem der Erde?",
    "Wer schrieb das Buch 'Der Ursprung der Arten'?",
    "Was ist die chemische Formel für Tafelwasser?",
    "Welches ist das kleinste Säugetier der Welt?",
    "Welches Land hat die meisten UNESCO-Welterbestätten?",
    "Welches Tier hat den größten Herzschlag pro Minute?",
    "Welches Land hat den längsten unbebauten Strand?",
    "Wer ist der einzige Präsident der USA, der mehr als zwei Amtszeiten gedient hat?",
    "Welches Tier hat den längsten Schwanz unter den Landtieren?",
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
    {"Russland", "Kanada", "China", "USA"},
    {"24", "12", "36", "48"},
    {"Stickstoff", "Kohlenstoff", "Sauerstoff", "Wasserstoff"},
    {"H2O", "CO2", "O2", "NaCl"},
    {"Amazonas", "Nil", "Jangtse", "Mississippi"},
    {"Canberra", "Sydney", "Melbourne", "Perth"},
    {"Anakonda", "Königskobra", "Python", "Schwarze Mamba"},
    {"Natriumchlorid", "Kaliumchlorid", "Eisen(III)-chlorid", "Calciumchlorid"},
    {"Anden", "Rockies", "Himalaya", "Alpen"},
    {"Big Ben", "Sonnenuhr", "Rolex", "Uhr des Königs"},
    {"Kaspisches Meer", "Lake Superior", "Lake Baikal", "Victoria-See"},
    {"Jupiter", "Saturn", "Uranus", "Neptun"},
    {"Portugiesisch", "Spanisch", "Französisch", "Englisch"},
    {"Yellowstone", "Yosemite", "Grand Canyon", "Everglades"},
    {"Astronomie", "Astrophysik", "Kosmologie", "Astrologie"},
    {"Sauerstoff", "Silizium", "Aluminium", "Eisen"},
    {"Arizona", "Kalifornien", "Utah", "Nevada"},
    {"Reise um die Erde", "Reise zum Mittelpunkt der Erde", "20.000 Meilen unter dem Meer", "Die geheimnisvolle Insel"},
    {"Kanaanäisch", "Akkadisch", "Sumerisch", "Hebräisch"},
    {"Vatikanstadt", "Monaco", "Nauru", "Tuvalu"},
    {"Hirohito", "Napoleon Bonaparte", "Kaiser Wilhelm II", "Winston Churchill"},
    {"Hundertjähriger Krieg", "Dreißigjähriger Krieg", "Achsenmächte gegen Alliierte", "Peloponnesischer Krieg"},
    {"Athen", "Rom", "USA", "Frankreich"},
    {"Juri Gagarin", "Neil Armstrong", "Buzz Aldrin", "Yuri Malenchenko"},
    {"Marianengraben", "Tiefseegraben von Puerto Rico", "Java-Tiefsee", "Philippinengraben"},
    {"Stummelschwanzkatzen", "Schmetterlingsfisch", "Murmeltier", "Axolotl"},
    {"Venus", "Mars", "Merkur", "Jupiter"},
    {"Charles Darwin", "Albert Einstein", "Isaac Newton", "Galileo Galilei"},
    {"H2CO3", "H2O", "HCl", "NaCl"},
    {"Etrusconyx", "Tadarida brasiliensis", "Suncus etruscus", "Crocidura suaveolens"},
    {"Italien", "China", "Spanien", "Deutschland"},
    {"Kolibri", "Eisbär", "Mensch", "Elefant"},
    {"Brasilien", "Australien", "Kanada", "Südafrika"},
    {"Franklin D. Roosevelt", "George Washington", "Abraham Lincoln", "Thomas Jefferson"},
    {"Muräne", "Giraffe", "Alligator", "Strauß"},
    {"Schweiz", "Deutschland", "Belgien", "Österreich"},
    {"Diamant", "Quarz", "Topas", "Saphir"},
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
    1, // Welche dieser Farben ist eine Primärfarbe? - Rot
    1, // Wer schrieb 'Romeo und Julia'? - William Shakespeare
    1, // Welches ist das schnellste Landtier? - Gepard
    4, // Wie viele Kontinente gibt es? - Sieben
    2, // Welches ist das kleinste Säugetier der Welt? - Maus
    3, // Was ist das größte Organ des menschlichen Körpers? - Haut
    1, // Welcher Ozean grenzt an die Westküste der Vereinigten Staaten? - Pazifischer Ozean
    1, // Welches Land hat die meisten Einwohner? - China
    1, // Welches Tier symbolisiert Weisheit? - Eule
    3, // Welche Jahreszeit folgt auf den Herbst? - Winter
    2, // Welches Element hat die chemische Bezeichnung 'H'? - Wasserstoff
    1, // Welches Land ist für seine Pyramiden bekannt? - Ägypten
    4, // Wie viele Zähne hat ein erwachsener Mensch normalerweise? - 32
    3, // Welches Tier legt keine Eier? - Hai
    2, // Welche Hauptstadt hat die Fläche von 891,8 km²? - Paris
    3, // Welcher Planet ist der kleinste in unserem Sonnensystem? - Mars
    2, // Welches Land hat die längste Landgrenze? - Russland
    4, // Wie viele Zeitzonen gibt es auf der Welt? - 24
    2, // Was ist die Hauptkomponente der Luft? - Sauerstoff
    1, // Was ist die chemische Formel für Wasser? - H2O
    2, // Welcher Fluss ist der längste der Welt? - Nil
    1, // Was ist die Hauptstadt von Australien? - Canberra
    3, // Welche ist die längste Schlange der Welt? - Python
    1, // Was ist der chemische Name für Salz? - Natriumchlorid
    3, // Was ist die höchste Bergkette der Welt? - Himalaya
    1, // Wie heißt die berühmteste Uhr der Welt? - Big Ben
    3, // Was ist der größte See der Welt? - Victoria-See
    2, // Welcher Planet hat die meisten Monde? - Saturn
    4, // Was ist die offizielle Sprache von Brasilien? - Portugiesisch
    3, // Was ist der bekannteste Nationalpark der USA? - Grand Canyon
    2, // Wie heißt die Wissenschaft von der Erforschung des Weltraums? - Astrophysik
    2, // Welches Element ist das zweithäufigste im Erdmantel? - Silizium
    2, // Wo befindet sich das Tal des Todes? - Kalifornien
    3, // Was ist der bekannteste Buchtitel von Jules Verne? - 20.000 Meilen unter dem Meer
    3, // Wie lautet die älteste bekannte schriftliche Sprache der Menschheit? - Sumerisch
    1, // Welches ist das kleinste Land der Welt? - Vatikanstadt
    4, // Wer ist der einzige Mensch, der jemals einen offiziellen Kriegseinsatz gegen die USA angeordnet hat? - Winston Churchill
    2, // Welcher Krieg gilt als der längste Krieg der Geschichte? - Dreißigjähriger Krieg
    4, // Was war das erste Land, das eine Demokratie hatte? - USA
    1, // Wer war der erste Mensch im Weltall? - Juri Gagarin
    1, // Was ist der tiefste Punkt auf der Erde? - Marianengraben
    2, // Welches Tier hat den längsten Schwanz im Verhältnis zu seiner Körpergröße? - Giraffe
    1, // Welcher Planet ist der nächste zum Sonnensystem der Erde? - Venus
    1, // Wer schrieb das Buch 'Der Ursprung der Arten'? - Charles Darwin
    1, // Was ist die chemische Formel für Tafelwasser? - H2CO3
    2, // Welches ist das kleinste Säugetier der Welt? - Schmetterlingsfisch
    1, // Welches Land hat die meisten UNESCO-Welterbestätten? - Italien
    3, // Welches Tier hat den größten Herzschlag pro Minute? - Mensch
    2, // Welches Land hat den längsten unbebauten Strand? - Australien
    4, // Wer ist der einzige Präsident der USA, der mehr als zwei Amtszeiten gedient hat? - Franklin D. Roosevelt
    2, // Welches Tier hat den längsten Schwanz unter den Landtieren? - Muräne
    1, // Welches Land hat den höchsten Pro-Kopf-Verbrauch an Schokolade? - Schweiz
    2, // Was ist das härteste natürlich vorkommende Material auf der Erde? - Quarz
    1  // Wer war der erste Mensch, der den Mount Everest bestieg? - Sir Edmund Hillary
    };
  } 
  
  public String[] getQuestions() {
    return questions;
  }
  
  public String[][] getAnswers() {
    return answers;
  }
  
  public int[] getCorrectAnswers() {
    return correctAnswers;
  }                          
}
