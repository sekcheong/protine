package ml.learner.neuralnet.initializers;

import java.util.Random;

public class DefaultWeightInitializer implements WeightInitializer {

	private Random _r = new Random();


	public DefaultWeightInitializer() {

	}


	@Override
	public void initializeWeights(double[][] W) {
		// initialize the weights of the neuron connecting from L-1 layer to L
		for (int j = 0; j < W.length; j++) {
			for (int i = 0; i < W[0].length; i++) {
				W[j][i] = _r.nextDouble() * 0.2;
			}
		}
	}

}