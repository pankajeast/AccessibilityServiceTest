package jp.co.smj.sample.accessibilityservicetest;

import android.accessibilityservice.AccessibilityService;
import android.util.Log;
import android.view.KeyEvent;
import android.view.accessibility.AccessibilityEvent;

public class KeyAccessibilityService extends AccessibilityService {
    private static final String TAG = KeyAccessibilityService.class.getSimpleName();

    @Override
    public void onServiceConnected() {
        Log.d(TAG, "on Service Connected");
    }

    @Override
    public void onAccessibilityEvent(AccessibilityEvent event) {
    }

    @Override
    public void onInterrupt() {
        Log.d(TAG, "onInterrupt");
    }

    @Override
    protected boolean onKeyEvent(KeyEvent event) {
        int key = event.getKeyCode();
        Log.d(TAG, String.format("onKeyEvent:keycode=%d action=%d", key, event.getAction()));

        switch(key){
            case KeyEvent.KEYCODE_VOLUME_DOWN:
                Log.i(TAG, "KEYCODE_VOLUME_DOWN");
                break;
            case KeyEvent.KEYCODE_VOLUME_UP:
                Log.i(TAG, "KEYCODE_VOLUME_UP");
                break;
        }
        return super.onKeyEvent(event);
    }

    private void sendKeyEvent() {

    }
}
