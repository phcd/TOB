package tob.states;

interface State
{
  void transition(TransitionMachine wrapper, int inputValue);
}
