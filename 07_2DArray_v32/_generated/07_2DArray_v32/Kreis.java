/**
 * Ein Kreis (bzw. eine Ellipse) wird auf der Grafik-Konsole dargestellt.
 * Die Farbe kann nach Füll- und Rand-Farbe getrennt dargestell werden.
 */
public class Kreis extends Grafik {     // TODO: rename to Ellipse

    /** Breite des Kreises, groesser gleich 0 */
    private int width;

	/** Höhe des Kreises, groesser gleich 0 */
    private int height;

	/** Farbe des Rands */
    private String bordercolor = "#444444";

	/** Breite des Rands, Default = 1 */
	private int borderwidth = 1;

    /** 
     * Voller Constructor mit allen änderbaren Eigenschaften.
     * Erzeugt ein Kreis-Grafik-Objekt und stellt es auf der Grafik-Konsole dar
	 * @param _x  x-Koordinate der oberen linken Ecke des Grafik-Objekts, 0 ist dabei ganz links
	 * @param _y  y-Koordinate der oberen linken Ecke des Grafik-Objekts, 0 ist dabei ganz oben
	 * @param _width Breite des Kreises, Werte kleiner 0 werden auf 0 gesetzt
	 * @param _height Höhe des Kreises, Werte kleiner 0 werden auf 0 gesetzt
	 * @param _fillcolor Farbe des Hintergrunds
	 * @param _bordercolor Farbe des Rands
	 * @param _borderwidth Breite des Rands 
	 * @param _callbackString der String, der eingelesen wird, wenn auf das Grafik-Objekt geklickt wird
	 */
    public Kreis(int _x, int _y, int _width, int _height, 
                   String _fillcolor, String _bordercolor, int _borderwidth, String _callbackString) {
        super(_x, _y, _fillcolor, _callbackString);

        /// "Kreis() id = " + id
        this.width = _width;
        this.height = _height;

        this.bordercolor = _bordercolor;
        this.borderwidth = _borderwidth;
        
        this.draw();	// sofort beim Erzeugen des Java-Objekts auch auf der Konsole anzeigen.
        				// das Positioniert den Kreis in SVG mit der Mitte an x und y, so ist es noch implementiert
        this.moveTo(x, y);	// Kompensation für die nicht gewollte Positionierung der Mitte des Kreises, sondern der linken oberen Ecke
        				// wenn auch in 5Code ein Kreis mit x und y und nicht mit cx und cy positioniert wird, kann das moveTo() weg.
    }

    /** 
     * Voller Constructor mit allen änderbaren Eigenschaften.
     * Erzeugt ein Kreis-Grafik-Objekt und stellt es auf der Grafik-Konsole dar
	 * @param _x  x-Koordinate der oberen linken Ecke des Grafik-Objekts, 0 ist dabei ganz links
	 * @param _y  y-Koordinate der oberen linken Ecke des Grafik-Objekts, 0 ist dabei ganz oben
	 * @param _radius Radius des Kreises, Werte kleiner 0 werden auf 0 gesetzt
	 * @param _fillcolor Farbe des Hintergrunds
	 * @param _bordercolor Farbe des Rands
	 * @param _borderwidth Breite des Rands 
	 * @param _callbackString der String, der eingelesen wird, wenn auf das Grafik-Objekt geklickt wird
	 */
    public Kreis(int _x, int _y, int _radius, 
                   String _fillcolor, String _bordercolor, int _borderwidth, String _callbackString) {
        super(_x, _y, _fillcolor, _callbackString);


        this.width  = (_radius >= 0 ? _radius : 0) * 2;
        this.height = (_radius >= 0 ? _radius : 0) * 2;

        this.bordercolor = _bordercolor;
        this.borderwidth = _borderwidth;
        
        this.draw();	// sofort beim Erzeugen des Java-Objekts auch auf der Konsole anzeigen.
        				// das Positioniert den Kreis in SVG mit der Mitte an x und y, so ist es noch implementiert
        this.moveTo(x, y);	// Kompensation für die nicht gewollte Positionierung der Mitte des Kreises, sondern der linken oberen Ecke
        				// wenn auch in 5Code ein Kreis mit x und y und nicht mit cx und cy positioniert wird, kann das moveTo() weg.
    }

    
    // CIRCLE
    // [0] GConsole
    // [1] circle
    // [2] id
    // [3] draw
    // [4] x
    // [5] y
    // [6] width
    // [7] height
    // [8] fill color
    // [9] border color
    // [10] border width
    // [11] callbackString

    /** 
     * Stellt den Kreis auf der Grafik-Konsole dar.
     */
    public void draw() {
        int cx = (this.x+(this.width/2));
        int cy = (this.y+(this.height/2));
         
        ///" draw cx = " + cx + "    cy=" + cy
        System.out.println("GConsole;;circle;;"+this.id+";;draw;;"
            +cx+";;"+cy+";;"+this.width+";;"+this.height
            +";;"+this.fillcolor+";;"+this.bordercolor+";;"+this.borderwidth+";;"+this.callbackString);
    }

    /** 
     * Bewegt den Kreis auf die angegebene Position.
	 * @param _x  x-Koordinate der oberen linken Ecke des Grafik-Objekts, 0 ist dabei ganz links
	 * @param _y  y-Koordinate der oberen linken Ecke des Grafik-Objekts, 0 ist dabei ganz oben
     */
    public void moveTo(int _x, int _y) {
		// zuerst: Objekt-Koordinaten ändern
        /// move to
    	this.x = _x;
        this.y = _y;
		// dann: Kommando an Grafik-Konsole schicken

        // noch: Kompensation, dass nicht mit x und y sondern  mit cx und cy positioniert wird,
    	//    -> wenn das in 5Code korrigiert ist, kann -(this.width/2) weg, ebenso -(this.height/2)

    	int cx = (this.x+(this.width/2));
        int cy = (this.y+(this.height/2));
        ///" moveTo cx = " + cx + "    cy=" + cy

    	System.out.println("GConsole;;circle;;"+this.id+";;move;;"+cx+";;"+cy);
    }

    
    /** 
     * Bewegt den Kreis um die angegebene Differenz.
     * @param _dx  Änderung der x-Koordinate, positive Werte bewegen nach rechts 
     * @param _dy  Änderung der y-Koordinate, positive Werte bewegen nach unten 
     */
    public void moveBy(int _dx, int _dy) {
		// zuerst: Objekt-Koordinaten ändern
		/// move by 
		this.x += _dx;
        this.y += _dy;
		// dann: Kommando an Grafik-Konsole schicken

        int cx = (this.x+(this.width/2));
        int cy = (this.y+(this.height/2));
        ///" moveBy cx = " + cx + "    cy=" + cy

        // noch: Kompensation, dass nicht mit x und y sondern  mit cx und cy positioniert wird,
    	//    -> wenn das in 5Code korrigiert ist, kann -(this.width/2) weg, ebenso -(this.height/2)
    	System.out.println("GConsole;;circle;;"+this.id+";;move;;"+cx+";;"+cy);
    }


    /** 
     * Setzt die Breite des Kreises.
     * @param _width, Werte kleiner 0 werden auf 0 gesetzt
     */
    public void setWidth(int _width) {
		this.width = (_width >= 0 ? _width : 0);
        this.redraw();
    }
    
    /** 
     * Setzt die Höhe des Kreises.
     * @param _height, Werte kleiner 0 werden auf 0 gesetzt
     */
    public void setHeight(int _height) {
        this.height = (_height >= 0 ? _height : 0);
        this.redraw();
    }

    /** 
     * Setzt den Radius des Kreises.
     * @param _radius, Werte kleiner 0 werden auf 0 gesetzt
     */
    public void setRadius(int _radius) {
        this.height = (_radius >= 0 ? _radius : 0) * 2;
        this.width  = (_radius >= 0 ? _radius : 0) * 2;
        this.redraw();
    }

    /** 
     * Setzt die Farbe des Rands des Rechtecks.
   	 * @param _bordercolor Farbe des Rands des Rechtecks, erlaubte Werte siehe in allgemeiner Beschreibung
     */
    public void setBordercolor(String _bordercolor) {
        this.bordercolor = _bordercolor;
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
    
} // end class 
