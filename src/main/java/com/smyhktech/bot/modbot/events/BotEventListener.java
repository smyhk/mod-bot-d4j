/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.smyhktech.bot.modbot.events;

import sx.blah.discord.api.events.EventSubscriber;
import sx.blah.discord.handle.impl.events.ReadyEvent;

/**
 *
 * @author skedzie
 */
public class BotEventListener {
    
    @EventSubscriber
    public void onReady(ReadyEvent event) {
        System.out.println("ModBot is online");
    }
}
