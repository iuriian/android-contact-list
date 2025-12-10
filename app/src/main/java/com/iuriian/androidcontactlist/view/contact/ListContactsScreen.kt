package com.iuriian.androidcontactlist.view.contact

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.iuriian.androidcontactlist.view.components.Card
import com.iuriian.androidcontactlist.view.components.DefaultButton
import com.iuriian.androidcontactlist.view.components.Screen

@Composable
fun ListContactsScreen(onCreateButtonClicked: () -> Unit) {
    Screen {
        Column(
            modifier = Modifier.padding(16.dp),
            verticalArrangement = Arrangement.SpaceBetween,
        ) {
            Column(
                modifier = Modifier.fillMaxWidth(),
                verticalArrangement = Arrangement.spacedBy(10.dp),
            ) {
                Card(text = "teste 1", onDeleteClicked = {})
                Card(text = "teste 2", onDeleteClicked = {})
            }

            DefaultButton(
                modifier = Modifier.fillMaxWidth(),
                label = "Novo contato",
                onButtonClicked = onCreateButtonClicked,
            )
        }
    }
}
