package celik.alpay.cizimcanvas;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.view.MotionEvent;
import android.view.View;

/**
 * Created by ALPAY on 29.12.2017.
 */

public class Cizim extends View {
    Path path = new Path();
    Paint paint = new Paint();

    public Cizim(Context c){
        super(c);
        paint.setColor(Color.BLACK);
        paint.setAntiAlias(true);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        canvas.drawPath(path,paint);
        super.onDraw(canvas);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        float x = event.getX();
        float y = event.getY();
        path.addCircle(x,y,10, Path.Direction.CW);
        invalidate();
        return true;
    }
}
