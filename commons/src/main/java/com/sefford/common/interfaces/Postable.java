package com.sefford.common.interfaces;

/**
 * Postable interface done to abstract a notification interface.
 * <p/>
 * This is done to separate the notification system and avoid the callbacks. Typically this is intended
 * to use it straightforward with an Event Bus as <a href="GreenRobot's">https://github.com/greenrobot/EventBus</a> or
 * <a href="Square's Otto">http://square.github.io/otto/</a>.
 * <p/>
 * In this way the developer will be able to notify of events to upper layers of the domain without
 * falling into a Callback hell
 *
 * @author Saul Diaz <sefford@gmail.com>
 */
public interface Postable {

    /**
     * Posts an object to the notification manager.
     *
     * @param event Event to send through the notification system.
     */
    void post(Object event);
}
