package shivanna.com.plivocall;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.plivo.endpoint.EventListener;
import com.plivo.endpoint.Incoming;
import com.plivo.endpoint.Outgoing;

public class DashBoard extends Activity implements EventListener, View.OnClickListener {

    EditText numberText = null;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dashboard_layout);
        Button callBtn = (Button)findViewById(R.id.initiate_call_btn);
        callBtn.setOnClickListener(this);
        numberText = (EditText) findViewById(R.id.dialer_number_edittext);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    @Override
    public void onLogin() {

    }

    @Override
    public void onLogout() {

    }

    @Override
    public void onLoginFailed() {

    }

    @Override
    public void onIncomingDigitNotification(String s) {

    }

    @Override
    public void onIncomingCall(Incoming incoming) {

    }

    @Override
    public void onIncomingCallHangup(Incoming incoming) {

    }

    @Override
    public void onIncomingCallRejected(Incoming incoming) {

    }

    @Override
    public void onOutgoingCall(Outgoing outgoing) {

    }

    @Override
    public void onOutgoingCallAnswered(Outgoing outgoing) {

    }

    @Override
    public void onOutgoingCallRejected(Outgoing outgoing) {

    }

    @Override
    public void onOutgoingCallHangup(Outgoing outgoing) {

    }

    @Override
    public void onOutgoingCallInvalid(Outgoing outgoing) {

    }

    @Override
    public void onClick(View v) {
        if(TextUtils.isEmpty(numberText.getText())) {

            Toast.makeText(this, "Please enter number", Toast.LENGTH_SHORT).show();
            return;
        }

        if(v.getId() == R.id.initiate_call_btn) {
            if(PlivoSingleton.getInstance().mIncomingCall != null
                    || PlivoSingleton.getInstance().mOutgoingCall != null) {
                Toast.makeText(this, "Call in progress", Toast.LENGTH_SHORT).show();
                return;
            }
        }

        PlivoSingleton.getInstance().mOutgoingCall.call(numberText.getText().toString());
    }

    private void initiateCalle() {

    }
}
