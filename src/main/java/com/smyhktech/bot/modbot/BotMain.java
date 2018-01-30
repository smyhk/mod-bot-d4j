/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.smyhktech.bot.modbot;

import com.smyhktech.bot.modbot.commands.PingCommand;

/**
 *
 * @author skedzie
 */
public class BotMain {
    
    public static Bot bot;
    
    public static void main(String[] args) {
        
        // This will be changed to load from file or enviroment varible
        bot = new Bot("NDA3OTg1NTMzNDgzMjIxMDEz.DVJdtA.QdoYGghT9uCiwK0M266a_CzOfoA");
        
        // bot commands
        // bot commands
        bot.addCommand(new PingCommand());
    }
}
