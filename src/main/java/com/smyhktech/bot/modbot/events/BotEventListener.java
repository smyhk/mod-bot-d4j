/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.smyhktech.bot.modbot.events;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import sx.blah.discord.api.events.EventSubscriber;
import sx.blah.discord.handle.impl.events.ReadyEvent;
import sx.blah.discord.handle.impl.events.guild.member.UserJoinEvent;
import sx.blah.discord.handle.impl.events.guild.member.UserLeaveEvent;
import sx.blah.discord.handle.obj.IChannel;
import sx.blah.discord.handle.obj.IUser;

/**
 *
 * @author skedzie
 */
public class BotEventListener {
    
    private IUser user;
    private IChannel channel;
    private final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
    
    @EventSubscriber
    public void onReady(ReadyEvent event) {
        System.out.println("ModBot is online");
    }
    
    @EventSubscriber
    public void userJoin(UserJoinEvent event) {
        user = event.getUser();
        
        LocalDateTime joinTime = event.getJoinTime();
        String formattedDate = formatter.format(joinTime);
        
        channel = event.getGuild().getChannelByID(257709519415672832L);
        String message = user.mention() + " joined at: " + formattedDate;
        
        channel.sendMessage(message);
    }
    
    @EventSubscriber
    public void userLeave(UserLeaveEvent event) {
        user = event.getUser();
        
        LocalDateTime leaveTime = LocalDateTime.now();
        String formattedDate = formatter.format(leaveTime);
        
        channel = event.getGuild().getChannelByID(257709519415672832L);
        String message = user.mention() + " left at: " + formattedDate;
        
        channel.sendMessage(message);
    }
}
