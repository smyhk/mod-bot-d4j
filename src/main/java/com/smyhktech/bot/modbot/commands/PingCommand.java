/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.smyhktech.bot.modbot.commands;

import java.util.List;
import sx.blah.discord.handle.obj.IChannel;
import sx.blah.discord.handle.obj.IGuild;
import sx.blah.discord.handle.obj.IUser;

/**
 *
 * @author skedzie
 */
public class PingCommand implements Command {

    @Override
    public String getLabel() {
        return "ping";
    }

    @Override
    public String getDescription() {
        return "Ensures the bot is listenting";
    }

    @Override
    public void runCommand(IUser user, IChannel channel, IGuild guild, String label, List<String> args) {
        String pongMessage = ":ping_pong: pong!";
        user.getOrCreatePMChannel().sendMessage(pongMessage);
    }
}
