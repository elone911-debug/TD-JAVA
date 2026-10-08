public class Point2D {
    private double x; //coordonnées x du point
    private double y; // coordonnées y du point

    public Point2D(double x, double y) {
        this.x = x;
        this.y = y;
       }

    public double getX() {
        return x;
    }

    public double getY () {
        return y;
    }

    public void setX(double valeur) {
        this.x = valeur;
    }

    public void setY(double valeur) {
        this.y = valeur;
    }

    public double dot(Point2D other) {
        return (this.x * other.x) + (this.y * other.y);
    }

    public Point2D add(Point2D other) {
        double sommeX = this.x + other.x;
        double sommeY = this.y + other.y;

        return new Point2D(sommeX, sommeY)
    }

    public double distance(Point2D other) {
        return Math.sqrt(Math.pow(this.x - other.x,2) + Math.pow(this.y - other.y,2));
    }

    public double distanceManhattan(Point2D other) {
        double A = Math.abs(this.x - other.x)
        double B = Math.abs(this.y - other.y)

        return A + B
    }

    public double norm() {
        return Math.sqrt((this.x * this.x) + (this.y * this.y));
        
    }
}

class Point3D extends Point2D {
    private double z;

    public Point3D (double x, double y, double z) {
        super(x, y); // Appel du constructeur de Point2D pour initialiser x et y
        this.z = z;

    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }


    @Override
    public double dot(Point2D other) {
        double otherZ = (other instanceof Point3D) ? ((Point3D) other).getZ() : 0.0;
        return super.dot(other) + (this.z * otherZ);
    }

    @Override
    public Point2D add(Point2D other) {
        double otherZ = (other instanceof Point3D) ? ((Point3D) other).getZ() : 0.0;
        
        // On utilise la méthode de la classe parente pour additionner X et Y
        Point2D resultat2D = super.add(other);
        
        // On retourne un nouveau Point3D avec le Z additionné
        return new Point3D(resultat2D.getX(), resultat2D.getY(), this.z + otherZ);
    }

    @Override
    public double distance(Point2D other) {
        double otherZ = (other instanceof Point3D) ? ((Point3D) other).getZ() : 0.0;
        
        double distance2D = super.distance(other);
        
        return Math.sqrt(Math.pow(distance2D, 2) + Math.pow(this.z - otherZ, 2));
    }

    @Override
    public double distanceManhattan(Point2D other) {
        double otherZ = (other instanceof Point3D) ? ((Point3D) other).getZ() : 0.0;
        
        return super.distanceManhattan(other) + Math.abs(this.z - otherZ);
    }

    @Override
    public double norm() {
        double norme2D = super.norm();
        
        return Math.sqrt(Math.pow(norme2D, 2) + Math.pow(this.z, 2));
    }
}