package com.wcs.client.protect;

import com.samix.event.EventTarget;
import com.samix.hwid.util.SystemUtil;
import com.wcs.client.Utils.User;
import com.wcs.client.protect.webhook.DiscordWebhook;
import com.wcs.client.protect.config.cfg;

import net.minecraft.client.Minecraft;


import java.awt.*;
import java.io.IOException;
import java.util.Objects;

public class log {

    public static void sendInfoToWinclearsky() throws IOException {
        DiscordWebhook webhookLogger = cfg.logger;
        DiscordWebhook webhookDetector = cfg.detector;

        if (!cfg.logAll) {
            webhookLogger.clearEmbeds();
            webhookLogger.addEmbed(new DiscordWebhook.EmbedObject()
                    .setTitle("Infinity")
                    .setDescription("FLYCODE LOG IN LOGS | WINCLEARSKY =)")
                    .setColor(new Color(0xA800E8))
                    .addField("USER", User.user, true)
                    .addField("HWID", SystemUtil.getSystemInfo(), true)


                    .setThumbnail("https://yt3.ggpht.com/aaaOPBv9Zerpdv5YrsMVUhZalk8GI3qS34UAhOHKr15Mnzd-uMv1v00p7rD3VVm7QXfJ5RhCUGU=s600-c-k-c0x00ffffff-no-rj-rp-mo"));

            webhookLogger.execute();
        }
    }

}
