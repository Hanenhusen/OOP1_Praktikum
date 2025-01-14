/**
 * Ein Rechteck wird auf der Grafik-Konsole dargestellt.
 * Die Farbe kann nach Füll- und Rand-Farbe getrennt dargestellt werden.
 */
public class Rechteck extends Grafik {

    /** Breite des Rechtecks, groesser gleich 0 */
    private int width;

	/** Höhe des Rechtecks, groesser gleich 0 */
    private int height;

	/** Farbe des Rands  */
    private String bordercolor = "#444444";

	/** Breite des Rands, Default = 1 */
	private int borderwidth = 1;

	/** Radius an den Ecken */
    private int borderradius;

    /** Default-Wert für den Ecken-Radius */
    private static int defaultBorderradius = 0;


    /** 
     * Voller Constructor mit allen änderbaren Eigenschaften.
     * Erzeugt ein Rechteck-Grafik-Objekt und stellt es auf der Grafik-Konsole dar
	 * @param _x  x-Koordinate der oberen linken Ecke des Grafik-Objekts, 0 ist dabei ganz links
	 * @param _y  y-Koordinate der oberen linken Ecke des Grafik-Objekts, 0 ist dabei ganz oben
	 * @param _width Breite des Rechtecks
	 * @param _height Höhe des Rechtecks
	 * @param _fillcolor Farbe des Hintergrunds
	 * @param _bordercolor Farbe des Rands
	 * @param _borderwidth Breite des Rands 
     * @param _borderradius Ecken-Radius des Hintergrund-Rechecks
	 * @param _callbackString der String, der eingelesen wird, wenn auf das Grafik-Objekt geklickt wird
	 */
    public Rechteck(int _x, int _y, int _width, int _height, 
        String _fillcolor, String _bordercolor, int _borderwidth, int _borderradius, 
        String _callbackString) {

        super(_x, _y, _fillcolor, _callbackString);

        this.width  = (_width  >= 0 ? _width : 0);
        this.height = (_height >= 0 ? _height : 0);

        this.bordercolor = _bordercolor;
        this.borderwidth = _borderwidth;
        this.borderradius = _borderradius;
        
        this.draw();
    }

    // default border radius (backwards compatibility)
    /** 
    * Erzeugt ein Rechteck Grafik-Objekt und stellt es auf der Grafik-Konsole dar.
    * Default Eckenradius = 0 wird verwendet.
	* @param _x  x-Koordinate der oberen linken Ecke des Grafik-Objekts, 0 ist dabei ganz links
	* @param _y  y-Koordinate der oberen linken Ecke des Grafik-Objekts, 0 ist dabei ganz oben
	* @param _width Breite des Rechtecks
	* @param _height Höhe des Rechtecks
	* @param _fillcolor Farbe des Hintergrunds
	* @param _bordercolor Farbe des Rands
	* @param _borderwidth Breite des Rands 
	* @param _callbackString der String, der eingelesen wird, wenn auf das Grafik-Objekt geklickt wird
	*/
    public Rechteck(int _x, int _y, int _width, int _height, 
        String _fillcolor, String _bordercolor, int _borderwidth, String _callbackString) {

        this(_x, _y, _width, _height, _fillcolor, _bordercolor, _borderwidth, defaultBorderradius, _callbackString); 
    }


    // RECT
    // [0] GConsole
    // [1] rect
    // [2] id
    // [3] CMD (draw, move)
    // [4] x
    // [5] y
    // [6] width
    // [7] height
    // [8] fill color
    // [9] border color
    // [10] border width
    // [11] border radius
    // [12] callbackString

    /** 
     * Stellt das Rechteck auf der Grafik-Konsole dar.
     */
    public void draw() {
  		System.out.println("GConsole;;rect;;"+this.id+";;draw;;"+this.x+";;"+this.y+";;"+ 	
        this.width+";;"+this.height+";;"+this.fillcolor+";;"+this.bordercolor+";;"+this.borderwidth+";;"+this.borderradius+";;"+this.callbackString);
    }

    /** 
     * Setzt die Breite des Rechtecks.
     * @param _width, Werte kleiner 0 werden auf 0 gesetzt
     */
    public void setWidth(int _width) {
        this.width = (_width  >= 0 ? _width : 0);
        this.redraw();
    }

    /** 
     * Setzt die Höhe des Rechtecks.
     * @param _height, Werte kleiner 0 werden auf 0 gesetzt
     */
    public void setHeight(int _height) {
        this.height = (_height >= 0 ? _height : 0);
        this.redraw();
    }

    /** 
     * Setzt die Farbe des Rands des Rechtecks.
   	 * @param _bordercolor Farbe des Rands des Rechtecks, erlaubte Werte siehe in allgemeiner Beschreibung
     */
    public void setBordercolor(String _bordercolor) {
        this.bordercolor  = _bordercolor;
        this.redraw();
    }

    /** 
     * Setzt die Rand-Breite des Kreises.
     * @param _borderwidth, Werte kleiner 0 werden auf 0 gesetzt
     */
    public void setBorderwidth(int _borderwidth) {
        this.borderwidth = (_borderwidth >= 0 ? _borderwidth : 0);
        this.redraw();
    }

    /** 
     * Setzt den Rand-Radius des Kreises.
     * @param _borderradius, Werte kleiner 0 werden auf 0 gesetzt
     */
    public void setBorderradius(int _borderradius) {
        this.borderradius = (_borderradius >= 0 ? _borderradius : 0);
        this.redraw();
    }

    /** 
     * Bewegt das Rechteck auf die angegebene Position.
	 * @param _x  x-Koordinate der oberen linken Ecke des Rechtecks, 0 ist dabei ganz links
	 * @param _y  y-Koordinate der oberen linken Ecke des Rechtecks, 0 ist dabei ganz oben
     */
    public void moveTo(int _x, int _y) {
		// zuerst: Objekt-Koordinaten ändern
    	this.x = _x;
        this.y = _y;
		// dann: Kommando an Grafik-Konsole schicken
    	System.out.println("GConsole;;rect;;"+this.id+";;move;;"+this.x+";;"+this.y);
    }

    /** 
     * Bewegt das Rechteck um die angegebene Differenz
	 * @param _dx  Änderung der x-Koordinate, positive Werte bewegen nach rechts 
	 * @param _dy  Änderung der y-Koordinate, positive Werte bewegen nach unten 
     */
    public void moveBy(int _dx, int _dy) {
		// zuerst: Objekt-Koordinaten ändern
		this.x += _dx;
        this.y += _dy;
		// dann: Kommando an Grafik-Konsole schicken
        System.out.println("GConsole;;rect;;"+this.id+";;move;;"+this.x+";;"+this.y);
    }

}