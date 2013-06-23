package com.businesscard.View;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.EditText;
import com.businesscard.interfaces.*;

/**
 * Created by zhuhuihuihui on 13-6-23.
 */
public class EditTextWithTextListener extends EditText
{

    private EditTextListener myTextListener = null;

    public EditTextWithTextListener(Context context, AttributeSet attrs)
    {
        super(context, attrs);

    }

    public void setOnEditTextListener(EditTextListener listener)
    {
        this.myTextListener = listener;
    }

    @Override
    protected void onTextChanged(CharSequence text, int start, int lengthBefore, int lengthAfter)
    {
        if (null != myTextListener)
            myTextListener.textChanged(this.getId());
        super.onTextChanged(text, start, lengthBefore, lengthAfter);
    }
}
