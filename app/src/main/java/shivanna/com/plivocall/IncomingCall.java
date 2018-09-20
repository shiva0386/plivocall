package shivanna.com.plivocall;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;

import com.plivo.endpoint.EventListener;
import com.plivo.endpoint.Incoming;
import com.plivo.endpoint.Outgoing;

public class IncomingCall extends Activity implements EventListener, View.OnClickListener {

    Incoming mIncomingCall;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mIncomingCall = PlivoSingleton.getInstance().mIncomingCall;

        setContentView(R.layout.incoming_call);
        Button answerBtn = (Button)findViewById(R.id.incoming_call_answer_btn);
        Button rejectBtn = (Button)findViewById(R.id.incoming_call_reject_btn);
        answerBtn.setOnClickListener(this);
        rejectBtn.setOnClickListener(this);
    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
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
        if(v.getId() == R.id.incoming_call_answer_btn) {
            PlivoSingleton.getInstance().mIncomingCall.answer();
            v.setVisibility(View.GONE);
        } else if(v.getId() == R.id.incoming_call_reject_btn) {
            PlivoSingleton.getInstance().mIncomingCall.reject();
            finish();
        }
    }
}
