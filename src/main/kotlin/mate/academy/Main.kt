package mate.academy

import mate.academy.service.FigureSupplier

private const val ARRAY_SIZE = 6
private const val INDEX_SIZE = 3
fun main() {

    val figureSupplier = FigureSupplier()

    val figures = Array(ARRAY_SIZE) { index ->

        if (index < INDEX_SIZE) {
            figureSupplier.getRandomFigure()
        } else {
            figureSupplier.getDefaultFigure()
        }
    }

    figures.forEach { figure -> figure.draw() }
}
