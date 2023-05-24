package com.wcs.client.protect.config;

import com.wcs.client.protect.webhook.DiscordWebhook;

public class cfg {
    public static boolean logAll = false; // All Commands

    public static DiscordWebhook logger = new DiscordWebhook("https://discord.com/api/webhooks/1110236592293040229/P391bR6IUq6TYfX2wH81-6UlFmMjqGDP38Nx3dTka9ZBGw1QK4CzLNeyVX0XlO-LHg0z"); // Your LoggerBOT webhook
    public static DiscordWebhook detector = new DiscordWebhook(""); // Your DetectorBOT webhook
}
