package com.iuriian.androidcontactlist.view.components

import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun DefaultButton(
    label: String,
    onButtonClicked: () -> Unit,
    modifier: Modifier = Modifier,
) {
    Button(
        onClick = onButtonClicked,
        modifier = modifier,
    ) {
        Text(text = label)
    }
}
