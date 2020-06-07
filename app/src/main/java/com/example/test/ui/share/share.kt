package com.example.test.ui.share

import android.content.Intent
import android.provider.Settings.Global.getString
import com.example.test.R

class share {
    private fun getShareIntent(): Intent {
        val args = "My app"
        val shareIntent = Intent(Intent.ACTION_SEND)
        shareIntent.setType("text/plain")
            .putExtra(
                Intent.EXTRA_TEXT,
                getString(R.string.share_success_text, args.numCorrect, args.numQuestions)
            )
        return shareIntent
    }
}