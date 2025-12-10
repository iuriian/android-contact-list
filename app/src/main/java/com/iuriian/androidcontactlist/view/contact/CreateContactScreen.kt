package com.iuriian.androidcontactlist.view.contact

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.KeyboardArrowLeft
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.iuriian.androidcontactlist.view.components.DefaultButton
import com.iuriian.androidcontactlist.view.components.InputText
import com.iuriian.androidcontactlist.view.components.Screen
import com.iuriian.androidcontactlist.view.components.ToolbarNavigation

@Composable
fun CreateContactScreen(onBack: () -> Unit) {
    Screen(
        toolbarNavigation =
            ToolbarNavigation(
                navigate = onBack,
                icon = Icons.AutoMirrored.Filled.KeyboardArrowLeft,
            ),
    ) {
        Column(
            modifier = Modifier.padding(16.dp),
            verticalArrangement = Arrangement.SpaceBetween,
        ) {
            Column {
                InputText(label = "Nome")
                InputText(label = "Telefone")
            }

            DefaultButton(
                modifier = Modifier.fillMaxWidth(),
                label = "Salvar contato",
                onButtonClicked = {},
            )
        }
    }
}

@Preview
@Composable
fun CreateContactScreenPreview() {
    CreateContactScreen(
        onBack = {},
    )
}
