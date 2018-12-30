package elements.api.util.ext

import org.spongepowered.api.command.CommandSource
import org.spongepowered.api.item.inventory.ItemStackSnapshot
import org.spongepowered.api.text.Text
import org.spongepowered.api.text.action.TextActions
import org.spongepowered.api.text.format.TextColor
import org.spongepowered.api.text.format.TextColors
import org.spongepowered.api.text.format.TextStyle
import org.spongepowered.api.text.format.TextStyles
import java.net.URL

fun Iterable<Text>.join(): Text = Text.join(this)
infix fun Iterable<Text>.joinWith(separator: Text): Text = Text.joinWith(separator, this)

operator fun Text.plus(other: Text): Text = Text.of(this, other)
operator fun Text.plus(other: String): Text = Text.of(this, other)

fun String.text(): Text = Text.of(this)
fun String.newText(): Text.Builder = Text.builder(this)

infix fun String.color(color: TextColor): Text = newText().color(color).build()
infix fun String.style(style: TextStyle): Text = newText().style(style).build()

fun String.black(): Text = newText().color(TextColors.BLACK).build()
fun String.darkBlue(): Text = newText().color(TextColors.DARK_BLUE).build()
fun String.darkGreen(): Text = newText().color(TextColors.DARK_GREEN).build()
fun String.darkAqua(): Text = newText().color(TextColors.DARK_AQUA).build()
fun String.darkRed(): Text = newText().color(TextColors.DARK_RED).build()
fun String.purple(): Text = newText().color(TextColors.DARK_PURPLE).build()
fun String.gold(): Text = newText().color(TextColors.GOLD).build()
fun String.gray(): Text = newText().color(TextColors.GRAY).build()
fun String.darkGray(): Text = newText().color(TextColors.DARK_GRAY).build()
fun String.blue(): Text = newText().color(TextColors.BLUE).build()
fun String.aqua(): Text = newText().color(TextColors.AQUA).build()
fun String.green(): Text = newText().color(TextColors.GREEN).build()
fun String.red(): Text = newText().color(TextColors.RED).build()
fun String.pink(): Text = newText().color(TextColors.LIGHT_PURPLE).build()
fun String.yellow(): Text = newText().color(TextColors.YELLOW).build()
fun String.white(): Text = newText().color(TextColors.WHITE).build()
fun String.reset(): Text = newText().color(TextColors.RESET).build()

fun String.obfuscated(): Text = newText().style(TextStyles.OBFUSCATED).build()
fun String.bold(): Text = newText().style(TextStyles.BOLD).build()
fun String.strikethrough(): Text = newText().style(TextStyles.STRIKETHROUGH).build()
fun String.underline(): Text = newText().style(TextStyles.UNDERLINE).build()
fun String.italic(): Text = newText().style(TextStyles.ITALIC).build()

fun Text.Builder.black(): Text.Builder = color(TextColors.BLACK)
fun Text.Builder.darkBlue(): Text.Builder = color(TextColors.DARK_BLUE)
fun Text.Builder.darkGreen(): Text.Builder = color(TextColors.DARK_GREEN)
fun Text.Builder.darkAqua(): Text.Builder = color(TextColors.DARK_AQUA)
fun Text.Builder.darkRed(): Text.Builder = color(TextColors.DARK_RED)
fun Text.Builder.purple(): Text.Builder = color(TextColors.DARK_PURPLE)
fun Text.Builder.gold(): Text.Builder = color(TextColors.GOLD)
fun Text.Builder.gray(): Text.Builder = color(TextColors.GRAY)
fun Text.Builder.darkGray(): Text.Builder = color(TextColors.DARK_GRAY)
fun Text.Builder.blue(): Text.Builder = color(TextColors.BLUE)
fun Text.Builder.aqua(): Text.Builder = color(TextColors.AQUA)
fun Text.Builder.green(): Text.Builder = color(TextColors.GREEN)
fun Text.Builder.red(): Text.Builder = color(TextColors.RED)
fun Text.Builder.pink(): Text.Builder = color(TextColors.LIGHT_PURPLE)
fun Text.Builder.yellow(): Text.Builder = color(TextColors.YELLOW)
fun Text.Builder.white(): Text.Builder = color(TextColors.WHITE)
fun Text.Builder.reset(): Text.Builder = color(TextColors.RESET)

fun Text.Builder.obfuscated(): Text.Builder = style(TextStyles.OBFUSCATED)
fun Text.Builder.bold(): Text.Builder = style(TextStyles.BOLD)
fun Text.Builder.strikethrough(): Text.Builder = style(TextStyles.STRIKETHROUGH)
fun Text.Builder.underline(): Text.Builder = style(TextStyles.UNDERLINE)
fun Text.Builder.italic(): Text.Builder = style(TextStyles.ITALIC)

infix fun Text.Builder.runCommand(command: String): Text.Builder = onClick(TextActions.runCommand(command))
infix fun Text.Builder.suggestCommand(command: String): Text.Builder = onClick(TextActions.suggestCommand(command))
infix fun Text.Builder.openUrl(url: URL): Text.Builder = onClick(TextActions.openUrl(url))
infix fun Text.Builder.execute(block: (CommandSource) -> Unit): Text.Builder = onClick(TextActions.executeCallback(block))
infix fun Text.Builder.changePage(page: Int): Text.Builder = onClick(TextActions.changePage(page))

infix fun Text.Builder.insertText(text: String): Text.Builder = onShiftClick(TextActions.insertText(text))

infix fun Text.Builder.showText(text: Text): Text.Builder = onHover(TextActions.showText(text))
infix fun Text.Builder.showItem(item: ItemStackSnapshot): Text.Builder = onHover(TextActions.showItem(item))