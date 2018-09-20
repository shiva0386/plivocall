package shivanna.com.plivocall;

import android.app.Application;

import com.plivo.endpoint.Endpoint;
import com.plivo.endpoint.EventListener;
import com.plivo.endpoint.Incoming;
import com.plivo.endpoint.Outgoing;

import shivanna.com.plivocall.interfaces.EndPointListner;

public class PlivoSingleton extends Application implements EventListener {
    private static final PlivoSingleton ourInstance = new PlivoSingleton();
    public Endpoint mEndpoint;
    public Incoming mIncomingCall;
    public Outgoing mOutgoingCall;

    public static PlivoSingleton getInstance() {
        return ourInstance;
    }

    public void setUpEndPoint() {
        mEndpoint = new Endpoint(true, this);
        mEndpoint.setRegTimeout(500);
    }

    @Override
    public void onCreate() {
        super.onCreate();
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
    public void onIncomingDigitNotification(String var1) {

    }

    @Override
    public void onIncomingCall(Incoming var1) {
        //write to calllog
        mIncomingCall = var1;

    }

    @Override
    public void onIncomingCallHangup(Incoming var1) {
        //write to calllog
    }

    @Override
    public void onIncomingCallRejected(Incoming var1) {
        //write to calllog
        mIncomingCall = null;
    }

    @Override
    public void onOutgoingCall(Outgoing var1) {
        //write to calllog
        mOutgoingCall = var1;
    }

    @Override
    public void onOutgoingCallAnswered(Outgoing var1) {
        //write to calllog
    }

    @Override
    public void onOutgoingCallRejected(Outgoing var1) {
        //write to calllog
        mOutgoingCall = null;
    }

    @Override
    public void onOutgoingCallHangup(Outgoing var1) {

    }

    @Override
    public void onOutgoingCallInvalid(Outgoing var1) {
        mOutgoingCall = null;
    }
}
