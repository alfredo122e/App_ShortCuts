package com.example.myapplicationshortcut

import android.content.Context
import android.content.Intent
import android.content.pm.ShortcutInfo
import android.content.pm.ShortcutManager
import android.graphics.drawable.Icon
import android.os.Build
import androidx.annotation.RequiresApi
import androidx.core.content.ContextCompat.getSystemService

const val shortcut_website_id = "id_website"
const val shortcut_messages_id = "id_messages"


@RequiresApi(Build.VERSION_CODES.N_MR1)
object Shortcuts {

    fun setUp(context: Context) {
        val shortcutManager =
            getSystemService(context, ShortcutManager::class.java)


        //Create an array of intents to create a more fluent user experience in the back stack
        val intents = arrayOf(
            Intent(Intent.ACTION_VIEW, null, context, MainActivity::class.java),
            Intent(Intent.ACTION_VIEW, null, context, Messages::class.java),
            Intent(Intent.ACTION_VIEW, null, context, MainActivity::class.java),
            Intent(Intent.ACTION_VIEW, null, context, Students::class.java)


        )

        val shortcut = ShortcutInfo.Builder(context, shortcut_website_id)
            .setShortLabel("Canvas")
            .setLongLabel("Canvas")
            .setIcon(Icon.createWithResource(context, R.drawable.canvas))
            .setIntents(intents)
            .build()


        val shortcut2 = ShortcutInfo.Builder(context, shortcut_messages_id)
            .setShortLabel("Portal del estudiante")
            .setLongLabel("Portal del estudiante")
            .setIcon(Icon.createWithResource(context, R.drawable.indice))
            .setIntents(intents)
            .build()

        shortcutManager!!.dynamicShortcuts = listOf(shortcut, shortcut2)
    }

}