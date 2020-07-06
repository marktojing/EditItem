package com.csnt.edititemlib;

import android.content.Context;
import android.content.res.ColorStateList;
import android.os.Build;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.csnt.ui_editbox.EditBox;

import androidx.annotation.ColorInt;
import androidx.annotation.RequiresApi;
import androidx.annotation.StringRes;

/**
 * Created by sunrain
 * 标题设置最多5个汉字
 * Created Date 2020/7/2 10:36 AM
 */
public class EditItem extends RelativeLayout {
    private Context mContext;
    private View mView;
    private TextView textView;
    private EditBox editBox;
    private EditText editText;
    public EditItem(Context context) {
        this(context,null);
    }

    public EditItem(Context context, AttributeSet attrs) {
        this(context, attrs,0);
    }

    public EditItem(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.mContext=context;
        initView(attrs,defStyleAttr);
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public EditItem(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        this.mContext=context;
        initView(attrs, defStyleAttr, defStyleRes);
    }
    private void initView(AttributeSet attrs, int defStyleAttr) {
        initView(attrs,defStyleAttr,0);
    }
    private void initView(AttributeSet attrs, int defStyleAttr,int defStyleRes) {
        //处理逻辑
        if(attrs!=null){
            //处理xml里的参数
        }
        LayoutInflater inflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        mView = inflater.inflate(R.layout.item_edit, this, true);
        editBox = mView.findViewById(R.id.edit_box);
        textView = mView.findViewById(R.id.text);
        editText = editBox.getEditText();
        editText.setHint("请输入信息");
        textView.setText("标题");
    }
    public View getLeftText(){
        return textView;
    }
    public View getRightView(){
        return editBox;
    }
    public String getTitle(){
        return textView.getText().toString().trim();
    }
    public String getValue(){
        return editBox.getText().trim();
    }
    public void setTitle(@StringRes int resId){
        textView.setText(resId);
    }
    public void setTitle(CharSequence resId){
        textView.setText(resId);
    }

    public void setTextColor(@ColorInt int color){
        editText.setTextColor(color);
    }
    public void setTextColor( ColorStateList color){
        editText.setTextColor(color);
    }
    public void setTitleColor(@ColorInt int color){
        textView.setTextColor(color);
    }
    public void setTitleColor( ColorStateList color){
        textView.setTextColor(color);
    }
    public void setHintColor(@ColorInt int color){
        editText.setHintTextColor(color);
    }
    public void setHintColor( ColorStateList color){
        editText.setHintTextColor(color);
    }
    public void setHint(CharSequence str){
        editText.setHint(str);
    }
    public void setHint(@StringRes int resid){
        editText.setHint(getContext().getResources().getText(resid));
    }
    public void setText(CharSequence str){
        editText.setText(str);
    }
    public void setText(@StringRes int resid){
        editText.setText(getContext().getResources().getText(resid));
    }
    public void setTitleSize(float size){
        textView.setTextSize(size);
    }

}
