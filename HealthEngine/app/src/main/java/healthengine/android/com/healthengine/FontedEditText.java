package healthengine.android.com.healthengine;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.EditText;

/**
 * Created by jsn on 10/2/16.
 */
public class FontedEditText extends EditText {
    public FontedEditText(Context context) {
        super(context);
        init(null);
    }

    public FontedEditText(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(attrs);
    }

    public FontedEditText(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(attrs);
    }

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    public FontedEditText(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        init(attrs);
    }

    public void init(AttributeSet attrs){

        if(attrs != null){
            TypedArray a =  getContext().obtainStyledAttributes(attrs, R.styleable.FontedText);
            String fontName =    a.getString(R.styleable.FontedText_font);
            if(fontName != null){
                Typeface typeface = Typeface.createFromAsset(getContext().getAssets(), fontName);
                setTypeface(typeface);
            }

            a.recycle();

        }
    }
}
