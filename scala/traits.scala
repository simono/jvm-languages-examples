trait Schwimmen { def schwimme() {} }

trait Fliegen { def fliege() {} }

abstract class Vogel

class Pinguin extends Vogel with Schwimmen
class Adler extends Vogel with Fliegen
