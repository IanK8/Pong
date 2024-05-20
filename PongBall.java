public class PongBall {
    public int x, y, xVelocity, yVelocity;
    public PongBall(int initX, int initY, int initXVel, int initYVel) {
        x = initX;
        y = initY;
        xVelocity = initXVel;
        yVelocity = initYVel;
    }
    void bounceX(){
        xVelocity = xVelocity * - 1;
    }
    void bounceY(){
        yVelocity = yVelocity * -1;
    }
    int getX(){
        return x;
    }
    int getY(){
        return y;
    }
    void move(){
        x = x + xVelocity;
        y = y + yVelocity;
    }
}
