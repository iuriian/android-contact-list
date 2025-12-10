package com.iuriian.androidcontactlist.view.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun InputText(
    modifier: Modifier = Modifier,
    label: String,
) {
    OutlinedTextField(
        value = "",
        onValueChange = {},
        label = {
            Text(text = label)
        },
        modifier = modifier.fillMaxWidth(),
    )
}
